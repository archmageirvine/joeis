package irvine.oeis.a063;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063265 Septinomial (also called heptanomial) coefficient array.
 * @author Sean A. Irvine
 */
public class A063265 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 1, 1, 1, 1, 1, 1);
  private int mN = 0;
  private int mM = -1;
  private Polynomial<Z> mA = RING.one();

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      mA = RING.pow(C, ++mN);
      mM = 0;
    }
    return mA.coeff(mM);
  }
}
