package irvine.oeis.a356;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A356037 Conjecturally, a(n) is the smallest number m such that every natural number is a sum of at most m n-simplex numbers.
 * @author Sean A. Irvine
 */
public class A356037 extends Sequence1 {

  private static final long HARD_LIMIT_BITS = 30; // Should be safe to increase this up to ~60 but will be very slow and memory intensive
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private long[] simplex(final long n, final long limit) {
    final ArrayList<Long> lst = new ArrayList<>();
    long k = n;
    while (true) {
      final Z t = Binomial.binomial(k, n);
      if (t.compareTo(limit) >= 0) {
        return LongUtils.toLong(lst);
      }
      lst.add(t.longValueExact());
      ++k;
    }
  }

  private boolean isComplete(final LongDynamicBooleanArray seen) {
    for (long k = seen.length() - 1; k >= 0; --k) {
      if (!seen.isSet(k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN == 2) {
      return Z.THREE; // proven value
    }
    // For smaller n with reasonably well established values we check less
    final long limit = 1L << Math.min(HARD_LIMIT_BITS, 3 * mN);
    final long[] simplex = simplex(mN, limit);
    int i = 0;
    // Overall marking of numbers seen
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    seen.set(0);
    // Numbers to expand on the next iteration
    LongDynamicLongArray queue = new LongDynamicLongArray();
    long qLen = 1;
    while (true) {
      ++i;
      if (mVerbose) {
        StringUtils.message("Starting checking for n=" + mN + " terms=" + i + " queue size=" + queue.length());
      }
      final LongDynamicLongArray nextQueue = new LongDynamicLongArray();
      long j = -1;
      for (long qPos = qLen; qPos >= 0; --qPos) {
        final long k = queue.get(qPos);
        for (final long v : simplex) {
          final long u = k + v;
          if (u >= limit) {
            break;
          }
          if (!seen.isSet(u)) {
            seen.set(u);
            nextQueue.set(++j, u);
          }
        }
      }
      if (isComplete(seen)) {
        return Z.valueOf(i);
      }
      qLen = j;
      queue = nextQueue;
    }
  }
}
