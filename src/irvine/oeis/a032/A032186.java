package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032186 Shifts left 2 places under "CIJ" <code>(necklace</code>, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032186 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.create(Collections.emptyList());
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
    final Q c = cij.coeff(mN - 2).divide(mN).divide(mN - 1);
    mA.add(c);
    return c.multiply(mF).toZ();
  }
}
