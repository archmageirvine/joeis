package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001802 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001802 extends Sequence0 {

  private int mN = -1;
  private int mTwoReduces = 3;

  @Override
  public Z next() {
    int m = ++mN + 6;
    while ((m & 1) == 0) {
      ++mTwoReduces;
      m >>>= 1;
    }
    return Binomial.binomial(2L * mN + 6, mN + 3).multiply(mN + 1).multiply(mN + 2).multiply(mN + 3).divide(6).shiftRight(mN + 6 - mTwoReduces);
  }
}
