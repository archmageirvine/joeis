package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007896 Psi_c(n), where Product_{k&gt;1} 1/(1-1/k^s)^phi(k) = Sum_{k&gt;0} psi_c(k)/k^s.
 * @author Sean A. Irvine
 */
public class A007896 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, -1);
  private int mN = 0;

  static Z[] dirmul(final Z[] f, final Z[] g) {
    final Z[] r = new Z[f.length];
    Arrays.fill(r, Z.ZERO);
    for (int k = 1; k <= f.length; ++k) {
      for (int j = 1; j * k <= r.length && j <= g.length; ++j) {
        r[k * j - 1] = r[k * j - 1].add(f[k - 1].multiply(g[j - 1]));
      }
    }
    return r;
  }

  private static int baseLength(int n, final int base) {
    int length = 0;
    while (n > 0) {
      n /= base;
      ++length;
    }
    return length;
  }

  protected int power(final int k) {
    return (int) Functions.PHI.l((long) k);
  }

  @Override
  public Z next() {
    Z[] v = new Z[++mN];
    Arrays.fill(v, Z.ZERO);
    v[0] = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      final int m = baseLength(mN, k) - 1;
      final Polynomial<Z> a = RING.series(RING.one(), RING.pow(X1, power(k), m), m);
      final Z[] w = new Z[mN];
      Arrays.fill(w, Z.ZERO);
      for (int i = 0, j = 1; i <= m; ++i, j *= k) {
        w[j - 1] = a.coeff(i);
      }
      v = dirmul(v, w);
    }
    return v[mN - 1];
  }
}
