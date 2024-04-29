package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033306 Triangle of coefficients of ordered cycle-index polynomials: T(n,k) = binomial(n,k)*Bell(k)*Bell(n-k).
 * @author Sean A. Irvine
 */
public class A033306 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(Functions.BELL.z(mM)).multiply(Functions.BELL.z(mN - mM));
  }
}

