package irvine.oeis.a054;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A054641 GCD of divisor-sum of primorials and primorials itself: a(n) = gcd(A002110(n), A000203(A002110(n))).
 * @author Sean A. Irvine
 */
public class A054641 extends A002110 {

  {
    super.next();
  }
  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    final Z p = super.next();
    return p.gcd(mFactor.factorize(p).sigma());
  }
}
