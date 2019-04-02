package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007575 Number of stable towers of 2 X 2 LEGO blocks.
 * @author Sean A. Irvine
 */
public class A007575 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  private static Polynomial<Z> poly(final int k) {
    final Z[] coeff = new Z[2 * k + 1];
    Arrays.fill(coeff, Z.ZERO);
    coeff[0] = Z.ONE;
    coeff[k] = Z.ONE;
    coeff[2 * k] = Z.ONE;
    return Polynomial.create(coeff);
  }

  static Polynomial<Z> getPoly(final int n, final int upper) {
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= n; ++k) {
      prod = RING.multiply(prod, poly(k), upper);
    }
    return prod;
  }

  @Override
  public Z next() {
    ++mN;
    final int s = mN * (mN + 1) / 2;
    final int lower = s - mN;
    final int upper = s + mN;
    final Polynomial<Z> prod = getPoly(mN, upper);
    Z sum = Z.ZERO;
    for (int l = lower; l <= upper; ++l) {
      sum = sum.add(prod.coeff(l));
    }
    return sum;
  }

}
