package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;


/**
 * A002698 Coefficients of Chebyshev polynomials: n*(2*n-3)*2^(2*n-5).
 * @author Sean A. Irvine
 */
public class A002698 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(2 * mN - 3).shiftLeft(2 * mN - 5);
  }
}
