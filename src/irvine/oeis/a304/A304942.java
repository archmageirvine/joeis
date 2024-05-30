package irvine.oeis.a304;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A304942 Triangle read by rows: T(n,k) is the number of nonisomorphic binary n X n matrices with k 1's per column under row and column permutations.
 * @author Sean A. Irvine
 */
public class A304942 extends Sequence0 {

  // After Andrew Howroyd

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  private Z permcount(final int[] v) {
    int sum = 0;
    Z m = Z.ONE;
    long k = 0;
    for (int i = 0; i < v.length; ++i) {
      final int t = v[i];
      k = i > 0 && t == v[i - 1] ? k + 1 : 1;
      m = m.multiply(t).multiply(k);
      sum += t;
    }
    return Functions.FACTORIAL.z(sum).divide(m);
  }

  private Q k(final int[] q, final int t, final int k) {
    Polynomial<Q> prod = RING.one();
    for (final int v : q) {
      final int g = Functions.GCD.i(t, v);
      prod = RING.multiply(prod, RING.pow(RING.onePlusXToTheN(v / g), g, k), k);
    }
    return prod.coeff(k);
  }

  protected Z blocks(final int n, final int m, final int k) {
    if (m == 0) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    final IntegerPartition part = new IntegerPartition(m);
    int[] q;
    while ((q = part.next()) != null) {
      Polynomial<Q> s = RING.zero();
      for (int t = 1; t <= n; ++t) {
        s = RING.add(s, RING.monomial(k(q, t, k).divide(t), t));
      }
      sum = sum.add(RING.exp(s, n).coeff(n).multiply(permcount(q)));
    }
    return sum.divide(Functions.FACTORIAL.z(m)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return blocks(mN, mN, mM);
  }
}
