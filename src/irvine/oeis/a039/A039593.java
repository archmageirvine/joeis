package irvine.oeis.a039;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A039593 Number of unitary divisors of central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A039593 extends A001405 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).unitarySigma0();
  }
}
