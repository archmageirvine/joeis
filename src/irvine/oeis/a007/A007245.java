package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007245 McKay-Thompson series of class <code>3C</code> for the Monster group.
 * @author Sean A. Irvine
 */
public class A007245 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private static final Z Z256 = Z.valueOf(256);
  protected int mN = -1;

  protected int power() {
    return 1;
  }

  protected Polynomial<Z> nextGf() {
    if (++mN == 0) {
      return RING.one();
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> s1 = RING.pow(RING.series(eta, eta2, mN), 8, mN);
    final Polynomial<Z> s2 = RING.pow(RING.series(eta2, eta, mN), 16, mN);
    return RING.add(RING.multiply(s2, Z256).shift(1), s1);
  }

  @Override
  public Z next() {
    return RING.pow(nextGf(), power(), mN).coeff(mN);
  }
}
