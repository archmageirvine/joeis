package irvine.oeis.a076;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;

/**
 * A076038 Square array read by antidiagonals in which row n has g.f. C/(1-n*x*C) where C = (1/2-1/2*(1-4*x)^(1/2))/x = g.f. for Catalan numbers A000108.
 * @author Sean A. Irvine
 */
public class A076038 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mCatalanSeq = new A000108();
  private final Polynomial<Z> mC = RING.empty();
  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    final Polynomial<Z> b = RING.subtract(RING.one(), RING.multiply(mC.shift(1), Z.valueOf(n)));
    return RING.coeff(mC, b, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mC.add(mCatalanSeq.next());
    }
    return t(mN - mM, mM);
  }
}
