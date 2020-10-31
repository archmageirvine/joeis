package irvine.oeis.a036;

import irvine.math.MemoryFunction2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036370 Triangle of coefficients of generating function of ternary rooted trees of height at most n.
 * @author Sean A. Irvine
 */
public class A036370 extends MemoryFunction2<Integer, Z> implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected Polynomial<Z> mT = RING.one();
  private int mM = -1;
  private int mN = 0;

  // T_{i+1}(z) = 1 + z * (T_i(z)^3/6 + T_i(z^2)*T_i(z)/2 + T_i(z^3)/3); T_0(z) = 1.

  protected int max(final int n) {
    return Z.THREE.pow(n).add(1).divide2().intValueExact();
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 0) {
      return Z.ZERO;
    }

    final int k = m - 1;

    // [z^k] T_(n-1)(z)^3
    Z sum = Z.ZERO;
    for (int a = 0; a <= k; ++a) {
      for (int b = 0; a + b <= k; ++b) {
        final int c = k - b - a;
        sum = sum.add(get(n - 1, a).multiply(get(n - 1, b)).multiply(get(n - 1, c)));
      }
    }

    // 3[z^k] T_(n-1)(z^2)T_(n-1)(z)
    for (int j = 0; j <= k; j += 2) {
      sum = sum.add(get(n - 1, j / 2).multiply(get(n - 1, k - j)).multiply(3));
    }

    // [z^k] 2T_(n-1)(z^3)
    if (k % 3 == 0) {
      sum = sum.add(get(n - 1, k / 3).multiply2());
    }

    return sum.divide(6);
  }

  @Override
  public Z next() {
    if (++mM >= max(mN)) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
