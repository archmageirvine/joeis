package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032119 Number of labeled series-reduced dyslexic planted planar trees (root unlabeled) with n leaves.
 * @author Sean A. Irvine
 */
public class A032119 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    if (mN < 3) {
      mA.add(new Q(Z.ONE, mF));
      return Z.ONE;
    }
    mA.add(Q.ZERO);
    final Q c = A032113.bij(mA, mN).coeff(mN);
    mA.set(mN, c);
    return c.multiply(mF).toZ();
  }
}
