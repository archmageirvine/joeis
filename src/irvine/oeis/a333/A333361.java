package irvine.oeis.a333;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a052.A052107;

/**
 * A333361 Array read by antidiagonals: T(n,k) is the number of directed loopless multigraphs with n arcs and k vertices.
 * @author Sean A. Irvine
 */
public class A333361 extends A052107 {

  // After Andrew Howroyd

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  protected Polynomial<Z> edgesPoly(final int[] v, final int degree) {
    Polynomial<Z> prod = RING.one();
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(v[i], v[j]);
        final int u = v[i] * v[j] / g;
        prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(u), 2 * g, degree), degree);
      }
    }
    for (final int j : v) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(j), j - 1, degree), degree);
    }
    return prod;
  }

  protected Polynomial<Z> g(final int n, final int degree) {
    if (n <= 0) {
      return RING.one();
    }
    Polynomial<Z> s = RING.zero();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      s = RING.add(s, RING.multiply(RING.series(RING.one(), edgesPoly(p, degree), degree), IntegerPartition.permCount(p, 1)));
    }
    return RING.divide(s, mF.factorial(n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return g(mN - mM, mM).coeff(mM);
  }
}
