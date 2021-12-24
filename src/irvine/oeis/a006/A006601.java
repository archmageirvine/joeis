package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006601 Numbers k such that k, k+1, k+2 and k+3 have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A006601 implements Sequence {

  private long mN = 1;
  protected final long[] mA;

  protected A006601(final int n) {
    mA = new long[n];
  }

  /** Construct the sequence. */
  public A006601() {
    this(3);
  }

  private boolean isConstant(final long s0) {
    if (s0 == mA[0]) {
      for (int k = 1; k < mA.length; ++k) {
        if (mA[k] != mA[k - 1]) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final long s0 = Cheetah.factor(++mN + mA.length).sigma0AsLong();
      final boolean ok = isConstant(s0);
      System.arraycopy(mA, 1, mA, 0, mA.length - 1);
      mA[mA.length - 1] = s0;
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

