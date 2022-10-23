package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003510 An equivalence relation on permutations.
 * @author Sean A. Irvine
 */
public class A003510 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.zero();
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mS = RING.add(mS, RING.monomial(new Q(Z.ONE, Z.valueOf(mN).multiply(LongUtils.phi(mN))), mN));
      mF = mF.multiply(mN);
    }
    return RING.exp(mS, mN).coeff(mN).multiply(mF).toZ();
  }
}

