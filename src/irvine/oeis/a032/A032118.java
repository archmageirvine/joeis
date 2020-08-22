package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032118 Shifts left 2 places under "BIJ" (reversible, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032118 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private Z mF = Z.ONE;
  private Z mF1 = null;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final Z f = mF1;
    mF1 = mF;
    mF = mF.multiply(++mN);
    if (mN < 4) {
      mA.add(new Q(Z.ONE, mF));
      return Z.ONE;
    }
    final Q c = A032113.bij(mA, mN).coeff(mN - 2);
    mA.add(c.divide(mN).divide(mN - 1));
    return c.multiply(f).toZ();
  }
}
