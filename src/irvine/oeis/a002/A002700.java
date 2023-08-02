package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;


/**
 * A002700 Coefficients of Chebyshev polynomials: n*(2*n+1) * 4^(n-1).
 * @author Sean A. Irvine
 */
public class A002700 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(2L * mN + 1).shiftLeft(2L * mN - 2);
  }
}
