package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000793;

/**
 * A074064 Number of cycle types of degree-n permutations having the maximum possible order.
 * @author Sean A. Irvine
 */
public class A074064 extends A000793 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  public Z next() {
    final Z aa = super.next();
    if (aa.bitLength() > 31) {
      throw new UnsupportedOperationException();
    }
    final long a = aa.longValue();

    Z coeff = Z.ZERO;
    for (final Z dd : Jaguar.factor(aa).divisors()) {
      final long d = dd.longValue();
      final int mu = Mobius.mobius(a / d);
      Polynomial<Z> div = RING.one();
      for (final Z k : Jaguar.factor(dd).divisors()) {
        div = RING.multiply(div, RING.oneMinusXToTheN(k.intValue()), mN);
      }
      coeff = coeff.add(RING.coeff(RING.one(), div, mN).multiply(mu));
    }
    return coeff;
  }
}
