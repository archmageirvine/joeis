package irvine.oeis.a391;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391610 Triangle T(n,k) read by rows: T(n,k) is the coefficient of x^k of the monic polynomial (1+x)^n + ((2*(1+x))^n - (2+x)^n) / x.
 * @author Sean A. Irvine
 */
public class A391610 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, 1);
  private static final Polynomial<Z> C2 = Polynomial.create(2, 2);
  private static final Polynomial<Z> C3 = Polynomial.create(2, 1);
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mRow = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mRow = RING.add(RING.pow(C1, mN, mN), RING.subtract(RING.pow(C2, mN, mN), RING.pow(C3, mN, mN)).shift(-1));
    }
    return mRow.coeff(mM);
  }
}
