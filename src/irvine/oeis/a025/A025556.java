package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025556 <code>a(n) =</code> sum of the exponents in the prime factorization of <code>LCM{1,3,6,...,C(n+1,2)}</code>.
 * @author Sean A. Irvine
 */
public class A025556 extends A025555 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
