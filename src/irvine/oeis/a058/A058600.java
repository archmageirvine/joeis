package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058600 McKay-Thompson series of class 27a for Monster.
 * @author Sean A. Irvine
 */
public class A058600 extends AbstractSequence {

  /* Construct the sequence. */
  public A058600() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X27 = RING.monomial(Z.ONE, 27);
  private static final Polynomial<Z> C = Polynomial.create(0, 0, 3);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta3 = RING.eta(X3, mN);
    final Polynomial<Z> eta27 = RING.eta(X27, mN);
    final Polynomial<Z> a = RING.series(eta3, eta27, mN);
    return a.coeff(mN).add(RING.coeff(C, a, mN));
  }
}
