package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023881 Number of partitions in expanding space: sigma(n,q) is the sum of the q-th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A023881 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mP = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mP = RING.add(mP, RING.monomial(new Q(Jaguar.factor(mN).sigma(mN), Z.valueOf(mN)), mN));
    }
    return RING.exp(mP, mN).coeff(mN).toZ();
  }
}

