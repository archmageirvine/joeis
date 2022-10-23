package irvine.oeis.a058;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058402 Coefficient triangle of polynomials (rising powers) related to Pell number convolutions. Companion triangle is A058403.
 * @author Sean A. Irvine
 */
public class A058402 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private static final Polynomial<Z> C1 = Polynomial.create(8, 4);
  private static final Polynomial<Z> C2 = Polynomial.create(4, 4);
  private static final Polynomial<Z> C3 = Polynomial.create(3, 1);
  private int mN = 0;
  protected int mM = -1;
  protected Polynomial<Z> mP = RING.one();
  protected Polynomial<Z> mQ = Polynomial.create(2);

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final Polynomial<Z> s = RING.substitute(mP, X1, mN);
      final Polynomial<Z> p = RING.add(RING.add(RING.multiply(s, C1),
          RING.multiply(mP, Polynomial.create(4L * (mN + 1), 2))),
        RING.multiply(RING.substitute(mQ, X1, mN), C3));
      final Polynomial<Z> q = RING.add(RING.multiply(s, C2), RING.multiply(mQ, Polynomial.create(4L * (mN + 1), 2)));
      mP = p;
      mQ = q;
    }
    return mP.coeff(mM);
  }
}

