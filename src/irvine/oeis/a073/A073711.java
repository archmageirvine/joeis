package irvine.oeis.a073;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073711 G.f. satisfies: A(x) = A(x^2) + x*A(x^2)^2.
 * @author Sean A. Irvine
 */
public class A073711 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private Polynomial<Z> mGf = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> gf2 = RING.substitute(mGf, X2, mN);
    mGf = RING.add(gf2, RING.pow(gf2, 2, mN - 1).shift(1));
    return mGf.coeff(mN);
  }
}
