package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A048784 a(n) = tau(binomial(2*n,n)), where tau = number of divisors (A000005).
 * @author Sean A. Irvine
 */
public class A048784 extends A000984 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
