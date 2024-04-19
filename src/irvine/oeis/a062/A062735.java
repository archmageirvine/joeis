package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062735 Triangular array T(n,k) giving number of weakly connected digraphs with n labeled nodes and k arcs (n &gt;= 1, 0 &lt;= k &lt;= n(n-1)).
 * @author Sean A. Irvine
 */
public class A062735 extends Sequence1 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Polynomial<Q> Y1 = Polynomial.create(Q.ONE, Q.ONE);
  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (m == 0) {
      return n == 1 ? Z.ONE : Z.ZERO;
    }
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int k = 0; k <= n; ++k) {
      sum = ring.add(sum, ring.monomial(inner.divide(inner.pow(Y1, k * (k - 1L)), new Q(Functions.FACTORIAL.z(k))), k));
    }
    return ring.log(sum, n).coeff(n).coeff(m).multiply(Functions.FACTORIAL.z(n)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
