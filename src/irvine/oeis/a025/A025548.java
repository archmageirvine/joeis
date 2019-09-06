package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025548 <code>a(n) =</code> sum of the exponents in the prime factorization of the least common multiple of <code>{1,3,5,...,2n-1}</code>.
 * @author Sean A. Irvine
 */
public class A025548 extends A025547 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
