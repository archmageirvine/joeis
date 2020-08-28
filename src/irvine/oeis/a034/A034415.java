package irvine.oeis.a034;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034415 Second term in extremal weight enumerator of doubly-even binary self-dual code of length 24n.
 * @author Sean A. Irvine
 */
public class A034415 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mF = RING.pow(Polynomial.create(1, 14, 1), 3);
  private Polynomial<Z> mG = RING.pow(RING.oneMinusXToTheN(1), 4).shift(1);

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int md = mN + 3;
    final Polynomial<Z> w0 = RING.pow(mF, mN, md);
    final Polynomial<Z> h = RING.series(mG, mF, md);
    Polynomial<Z> a = w0;
    Polynomial<Z> z = w0;
    for (int i = 1; i <= mN; ++i) {
      z = RING.multiply(z, h, md);
      a = RING.subtract(a, RING.multiply(z, a.coeff(i)));
    }
    return a.coeff(mN + 2);
  }
}
