package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025544 <code>a(n) =</code> sum of the exponents in the prime factorization of the least common multiple of the first n composite numbers.
 * @author Sean A. Irvine
 */
public class A025544 extends A025543 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
