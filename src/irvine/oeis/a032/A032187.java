package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032187 Shifts left 3 places under "CIJ" (necklace, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032187 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mN <= 3) {
      mA.add(Q.ONE.divide(mF));
      return Z.ONE;
    }
    final Polynomial<Q> cij = RING.negate(RING.log1p(RING.negate(mA), mN));
    final Q c = cij.coeff(mN - 3).divide(mN).divide(mN - 1).divide(mN - 2);
    mA.add(c);
    return c.multiply(mF).toZ();
  }
}
