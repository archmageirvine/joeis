package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034597 Leading coefficient of extremal theta series of even unimodular lattice in dimension 24n.
 * @author Sean A. Irvine
 */
public class A034597 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int coeff() {
    return 1;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int md = mN + 3;
    final Z[] sigma = new Z[md + 1];
    sigma[0] = Z.ONE;
    for (int k = 1; k <= md; ++k) {
      sigma[k] = Cheetah.factor(k).sigma(3).multiply(240);
    }
    final Polynomial<Z> f = RING.pow(Polynomial.create(sigma), 3, md);
    Polynomial<Z> g = RING.x();
    for (int k = 1; k <= md; ++k) {
      g = RING.multiply(g, RING.pow(RING.oneMinusXToTheN(k), 24, md), md);
    }
    final Polynomial<Z> w0 = RING.pow(f, mN, md);
    final Polynomial<Z> h = RING.series(g, f, md);
    Polynomial<Z> a = w0;
    Polynomial<Z> z = w0;
    for (int i = 1; i <= mN; ++i) {
      z = RING.multiply(z, h, md);
      a = RING.subtract(a, RING.multiply(z, a.coeff(i)));
    }
    return a.coeff(mN + coeff());
  }
}
