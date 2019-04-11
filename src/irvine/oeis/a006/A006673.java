package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006673 E.g.f. is the logarithmic derivative of e.g.f. for Pell numbers <code>[1, 0, 1, 2, 5, ...]</code>.
 * @author Sean A. Irvine
 */
public class A006673 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> tanh = RING.tanh(RING.x(), mN);
    final ArrayList<Q> adjCoeff = new ArrayList<>();
    int k = 0;
    for (final Q c : tanh) {
      if (adjCoeff.isEmpty()) {
        adjCoeff.add(Q.ONE);
      } else {
        adjCoeff.add(c.multiply(Z.ONE.shiftLeft(k++ / 2)).negate());
      }
    }
    return RING.coeff(RING.one(), RING.create(adjCoeff), mN).multiply(mF).toZ();
  }
}
