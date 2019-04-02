package irvine.oeis.a016;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A016095 Triangular array T(n,k) read by rows, where T(n,k) = coefficient of x^n*y^k in 1/(1-x-y-(x+y)^2).
 * @author Sean A. Irvine
 */
public class A016095 extends A000045 {

  private long mN = -1;
  private long mM = 0;
  private Z mF = super.next();

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mF = super.next();
    }
    return mF.multiply(Binomial.binomial(mN, mM));
  }
}
