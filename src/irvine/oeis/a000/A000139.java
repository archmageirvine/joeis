package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000139 a(n) = 2*(3*n)! / ((2*n+1)!*(n+1)!).
 * @author Sean A. Irvine
 */
public class A000139 implements Sequence {

  private Z mBinomial = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    } else if (mN == 1) {
      return Z.ONE;
    } else {
      mBinomial = mBinomial.multiply(3 * mN - 2).multiply(3 * mN - 1).multiply(3)
        .divide(Z.valueOf(2 * mN + 1).multiply(mN - 1)).divide2();
      return mBinomial.divide(mN).divide(mN + 1);
    }
  }
}

