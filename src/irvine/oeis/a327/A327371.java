package irvine.oeis.a327;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A327371 Triangle read by rows where T(n,k) is the number of unlabeled simple graphs with n vertices and exactly k endpoints (vertices of degree 1).
 * @author Sean A. Irvine
 */
public class A327371 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A327371(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A327371() {
    super(0);
  }

  private static final Polynomial<Z> C1 = Polynomial.create(0, 0, 1);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Polynomial<Z>> mGf = null;

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

  protected Polynomial<Polynomial<Z>> g(final int n) {
    final PolynomialRingField<Z> innerRing = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, n);
    final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(innerRing);
    Polynomial<Polynomial<Z>> g = ring.zero();
    for (int k = 0; k <= n; ++k) {
      Polynomial<Polynomial<Z>> gp = ring.zero();
      final IntegerPartition part = new IntegerPartition(k);
      int[] p;
      while ((p = part.next()) != null) {
        Polynomial<Polynomial<Z>> num = ring.one();
        Polynomial<Polynomial<Z>> den = ring.one();
        for (final int v : p) {
          num = ring.multiply(num, ring.oneMinusXToTheN(v), n - k);
          den = ring.multiply(den, ring.oneMinusXToTheN(innerRing.monomial(Z.ONE, v), v), n - k);
        }
        final Polynomial<Polynomial<Z>> t = ring.multiply(ring.series(num, den, n - k), innerRing.monomial(IntegerPartition.permCount(p).shiftLeft(edges(p)), 0));
        gp = ring.add(gp, t);
      }
      g = ring.add(g, ring.divide(gp, innerRing.monomial(mF.factorial(k), 0)).shift(k));
    }
    g = ring.multiply(g, ring.oneMinusXToTheN(innerRing.x(), 2));
    return ring.series(g, ring.oneMinusXToTheN(C1, 2), n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mGf = g(++mN);
      mM = 0;
    }
    return mGf.coeff(mN).coeff(mM);
  }
}
