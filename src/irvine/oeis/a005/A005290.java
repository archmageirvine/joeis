package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005290 Representation degeneracies for boson strings.
 * @author Sean A. Irvine
 */
public class A005290 extends AbstractSequence {

  /** Construct the sequence. */
  public A005290() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = degree() - 1;

  private Polynomial<Z> g(final int j, final Polynomial<Z> p) {
    Polynomial<Z> s = RING.zero();
    for (int k = 1; k <= mN + 1; ++k) {
      final Polynomial<Z> t = RING.monomial(Z.ONE, k * j + k * (k - 1) / 2);
      final Polynomial<Z> u = RING.pow(RING.oneMinusXToTheN(k), 2, mN + 1);
      s = RING.signedAdd((k & 1) == 1, s, RING.multiply(t, u, mN + 1));
    }
    return RING.multiply(RING.pow(p, 2, mN + 1), s, mN + 1);
  }

  protected int degree() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> pInv = RING.one();
    for (int k = 1; k < mN + 1; ++k) {
      pInv = RING.multiply(pInv, RING.oneMinusXToTheN(k), mN + 1);
    }
    final Polynomial<Z> p = RING.series(RING.one(), pInv, mN + 1);
    final Polynomial<Z> g = g(degree(), p);
    return g.coeff(mN);
  }
}
