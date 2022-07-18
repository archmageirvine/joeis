package irvine.oeis.a222;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A222208 a(1) = 1, a(2) = 3; for n&gt;2, a(n) = smallest number not in {a(1), ..., a(n-1)} such that a(n) is divisible by a(d) for all divisors d of n.
 * @author Sean A. Irvine
 */
public class A222208 implements Sequence {

  // Does not use MemorySequence to save memory
  // Various other contortions in an effort to allow A242211(9) to be computed

  protected final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicBooleanArray mB = new LongDynamicBooleanArray();
  private final HashSet<Long> mBBig = new HashSet<>();
  private long mN = 0;

  private boolean isSet(final long n) {
    if (n <= Integer.MAX_VALUE) {
      return mB.isSet(n);
    } else {
      return mBBig.contains(n);
    }
  }

  private void set(final long n) {
    if (n <= Integer.MAX_VALUE) {
      mB.set(n);
    } else {
      mBBig.add(n);
    }
  }

  @Override
  public Z next() {
    long h;
    if (++mN < 3) {
      h = 2L * mN - 1;
    } else {
      h = 1;
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        if (d > 1 && d < mN) {
          h = LongUtils.lcm(h, mA.get(d));
        }
      }
    }
    long i = 1;
    while (isSet(i * h)) {
      ++i;
    }
    set(i * h);
    mA.set(mN, i * h);
    return Z.valueOf(i * h);
  }
}
