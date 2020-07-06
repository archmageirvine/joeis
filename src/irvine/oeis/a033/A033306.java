package irvine.oeis.a033;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033306 Triangle of coefficients of ordered cycle-index polynomials: <code>T(n,k) = binomial(n,k)*Bell(k)*Bell(n-k)</code>.
 * @author Sean A. Irvine
 */
public class A033306 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(BellNumbers.bell(mM)).multiply(BellNumbers.bell(mN - mM));
  }
}

