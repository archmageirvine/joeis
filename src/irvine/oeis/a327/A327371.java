package irvine.oeis.a327;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A327371.
 * @author Sean A. Irvine
 */
public class A327371 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mGf = null;

  private static int edges(final int[] partition) {
    int cnt = 0;
    for (int i = 1; i < partition.length; ++i) {
      for (int j = 0; j < i; ++j) {
        cnt += IntegerUtils.gcd(partition[i], partition[j]);
      }
    }
    for (final int j : partition) {
      cnt += j / 2;
    }
    return cnt;
  }

  // todo make more incremental
  // todo perhaps Q is not needed?
  private Polynomial<Polynomial<Q>> g(final int n) {
    final PolynomialRingField<Q> innerRing = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, n);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(innerRing);
    Polynomial<Polynomial<Q>> g = ring.zero();
    for (int k = 0; k <= n; ++k) {
      Polynomial<Polynomial<Q>> gp = ring.zero();
      final IntegerPartition part = new IntegerPartition(k);
      int[] p;
      while ((p = part.next()) != null) {
        Polynomial<Polynomial<Q>> num = ring.one();
        Polynomial<Polynomial<Q>> den = ring.one();
        for (final int v : p) {
          num = ring.multiply(num, ring.oneMinusXToTheN(v), n - k);
          den = ring.multiply(den, ring.oneMinusXToTheN(innerRing.monomial(Q.ONE, v), v), n - k);
        }
        final Polynomial<Polynomial<Q>> t = ring.multiply(ring.series(num, den, n - k), innerRing.monomial(new Q(IntegerPartition.permCount(p).shiftLeft(edges(p))), 0));
        gp = ring.add(gp, t);
      }
      g = ring.add(g, ring.multiply(gp, innerRing.monomial(new Q(Z.ONE, mF.factorial(k)), 0)).shift(k));
    }
    g = ring.multiply(g, ring.oneMinusXToTheN(innerRing.x(), 2));
    g = ring.series(g, ring.oneMinusXToTheN(Polynomial.create(Q.ZERO, Q.ZERO, Q.ONE), 2), n);
    return g;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mGf = g(++mN);
      mM = 0;
    }
    return mGf.coeff(mN).coeff(mM).toZ();
  }
}
