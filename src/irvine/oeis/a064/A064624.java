package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064624 Generalization of the Genocchi numbers given by the Gandhi polynomials A(n+1,r) = r^3 A(n, r + 1) - (r - 1)^3 A(n, r); A(1,r) = r^3 - (r-1)^3.
 * @author Sean A. Irvine
 */
public class A064624 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.one();
    Z f3 = Z.ONE;
    for (int j = 1; j <= mN; ++j) {
      f3 = f3.multiply((long) j * j * j);
      Polynomial<Z> prod = RING.one();
      for (long k = 1; k <= j; ++k) {
        prod = RING.multiply(prod, Polynomial.create(1, k * k * k));
      }
      sum = RING.add(sum, RING.series(RING.monomial(f3, j), prod, mN));
    }
    return sum.coeff(mN);
  }
}
