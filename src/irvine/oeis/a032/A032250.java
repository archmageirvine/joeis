package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032250 "DHK[ n ](2n)" (bracelet, identity, unlabeled, n parts, evaluated at 2n) transform of 1,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032250 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  private Polynomial<Z> f(final int k, final int shift, final int m) {
    final int s = m - shift * k;
    Polynomial<Z> sum = RING.zero();
    for (final Z dd : Cheetah.factor(k).divisors()) {
      final int d = dd.intValue();
      final Z phi = Euler.phi(dd);
      final Polynomial<Z> t = RING.series(RING.one(), RING.pow(RING.oneMinusXToTheN(d * shift), k / d, s), s);
      sum = RING.add(sum, RING.multiply(t, phi));
    }
    sum = RING.divide(sum, Z.valueOf(k));
    final Polynomial<Z> u = RING.series(RING.onePlusXToTheN(shift), RING.pow(RING.oneMinusXToTheN(2 * shift), k / 2 + 1, s), s);
    sum = RING.subtract(sum, u).shift(shift * k);
    return RING.divide(sum, Z.TWO);
  }

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    Polynomial<Z> sum = RING.zero();
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(d);
      if (mu != 0) {
        sum = RING.signedAdd(mu == 1, sum, f(mN / d, d, 2 * mN));
      }
    }
    return sum.coeff(2 * mN);
  }
}
