package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A161575.
 * @author Sean A. Irvine
 */
public class A161575 implements Sequence {

  private int mN = 0;
  private final LongDynamicIntArray mDivisorCount = new LongDynamicIntArray();

  private boolean test(final long t, final int n, final String s) {
    int d = mDivisorCount.get(t);
    if (d == 0) {
      d = (int) Cheetah.factor(t).sigma0();
      mDivisorCount.set(t, d);
    }
    return d == n && Long.toString(t, 2).contains(s);
  }

  @Override
  public Z next() {
    ++mN;
    final String s = Integer.toString(mN, 2);
    long t = mN;
    while (!test(t, mN, s)) {
      ++t;
    }
    return Z.valueOf(t);
  }
}

