package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028343 Expansion of Product_{i&gt;=1} (1-x^i)^(1/i); also of exp(- Sum_{n&gt;=1}(d(n)*x^n/n)) where d(n) is the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A028343 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.zero();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mA = RING.subtract(mA, RING.monomial(new Q(Jaguar.factor(mN).sigma0(), Z.valueOf(mN)), mN));
      mF = mF.multiply(mN);
    }
    return RING.exp(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
