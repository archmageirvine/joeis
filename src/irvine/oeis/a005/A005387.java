package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005387 Number of partitional matroids on n elements.
 * @author Sean A. Irvine
 */
public class A005387 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> XM1 = RING.create(Arrays.asList(Q.NEG_ONE, Q.ONE));
  private static final Polynomial<Q> X2P1 = RING.create(Arrays.asList(Q.ONE, Q.TWO));
  private Z mF = Z.ONE;
  private int mN = -1;


  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> exp = RING.exp(RING.x(), mN);
    final Polynomial<Q> a = RING.add(RING.multiply(exp, XM1, mN), X2P1);
    return RING.exp(a, mN).coeff(mN).multiply(mF).toZ();
  }
}
