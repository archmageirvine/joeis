package irvine.oeis.a006;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A006057 Number of topologies on n labeled points satisfying axioms T_0-T_4.
 * @author Sean A. Irvine
 */
public class A006057 extends A006059 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mZ = RING.create(Collections.singletonList(Q.NEG_ONE));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mZ = RING.add(mZ, RING.monomial(new Q(super.next(), mF), mN));
    final Polynomial<Q> egf = RING.exp(mZ, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}

