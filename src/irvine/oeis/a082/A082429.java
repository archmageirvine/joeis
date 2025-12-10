package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082429 a(n) is the cardinality of the smallest subset S1 of S={1,2,3,...,n} such that every element of S is either in S1 or is the sum of two distinct elements of S1.
 * @author Sean A. Irvine
 */
public class A082429 extends Sequence1 {

  private int mN = 0;
  private long mMask = 0;
  private int mC = 1;
  private long mS = 1;

  private boolean is(final long s) {
    long m = s;
    for (long j = 1, k = 1; j <= s; j <<= 1, ++k) {
      if ((s & j) != 0) {
        m |= (s & ~j) << k;
      }
      if ((m & j) == 0) {
        return false; // We cannot get the value k
      }
    }
    return (m & mMask) == mMask;
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final long lim = 1L << mN;
    mMask = lim - 1;
    while (true) {
      for (long s = mS; s < lim; s = Functions.SWIZZLE.l(s)) {
        if (is(s)) {
          return Z.valueOf(mC);
        }
      }
      ++mC;
      mS = 2 * mS + 1;
    }
  }
}
