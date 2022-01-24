package irvine.oeis.a054;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A054083 Order of n in the permutation A054082 of the natural numbers.
 * @author Sean A. Irvine
 */
public class A054083 implements Sequence {

  private static final int HEURISTIC_LIMIT = 250;
  private final Sequence mSeq;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;

  protected A054083(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A054083() {
    this(new A054082());
  }

  private long a(final long n) {
    while (n >= mA.length()) {
      mA.set(mA.length(), mSeq.next().longValueExact());
    }
    return mA.get(n);
  }

  @Override
  public Z next() {
    long t = ++mN;
    final HashSet<Long> seen = new HashSet<>();
    do {
      t = a(t - 1);
      if (seen.size() > HEURISTIC_LIMIT) {
        return Z.NEG_ONE;
      }
    } while (seen.add(t));
    final long u = t;
    long cnt = 0;
    do {
      ++cnt;
      t = a(t - 1);
    } while (t != u);
    return Z.valueOf(cnt);
  }
}
