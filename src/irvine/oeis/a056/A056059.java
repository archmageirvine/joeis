package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A056059 GCD of largest square and squarefree part of central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A056059 extends A001405 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n = super.next();
    final Z core = mFactor.factorize(n).core();
    return core.gcd(n.divide(core));
  }
}
