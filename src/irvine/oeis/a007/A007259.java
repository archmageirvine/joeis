package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007259 Expansion of Product_{m&gt;=1} <code>(1 +</code> q^m)^(-8).
 * @author Sean A. Irvine
 */
public class A007259 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(X2, mN), mN), 8, mN).coeff(mN);
  }
}
