package irvine.oeis.a025;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A025561 a(n) = sum of the exponents in the prime factorization of LCM{1, n-1, ..., C(n-[ n/2 ],[ n/2 ])}.
 * @author Sean A. Irvine
 */
public class A025561 extends A025560 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}
