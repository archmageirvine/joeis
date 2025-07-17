package irvine.oeis.a370;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A370770 Triangle read by rows: T(n,k) is the number of k-trees with n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A370770 extends Sequence0 {

  // See https://oeis.org/A370770/a370770.txt

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private int mM = -1;

  private final HashMap<String, Polynomial<Q>> mUnlYCache = new HashMap<>();

  // Compute the generating function for unlabeled Y-rooted k-trees fixed by permutations of a given cycle type mu.
  private Polynomial<Q> unlY(final int[] mu, final int n) {
    if (n <= 0) {
      return RING.one();
    }
    final String key = Arrays.toString(mu) + n;
    final Polynomial<Q> cache = mUnlYCache.get(key);
    if (cache != null) {
      return cache;
    }
    Polynomial<Q> res = RING.zero();
    for (int i = 1; i <= n; ++i) {
      Polynomial<Q> prod = RING.one();
      final int[] mui = IntegerPartition.power(mu, i);
      for (final int c : mui) {
        prod = RING.multiply(prod, unlY(IntegerPartition.power(mui, c), (n - 1) / c).substitutePower(c, n), n);
      }
      res = RING.add(res, RING.divide(prod.substitutePower(i), Q.valueOf(i)).shift(i));
    }
    final Polynomial<Q> exp = RING.exp(res, n);
    mUnlYCache.put(key, exp);
    return exp;
  }

  private final HashMap<String, Polynomial<Q>> mUnlXYCache = new HashMap<>();

  private Polynomial<Q> unlXY(final int[] mu, final int n) {
    if (n <= 0) {
      return RING.zero();
    }
    final String key = Arrays.toString(mu) + n;
    final Polynomial<Q> cache = mUnlXYCache.get(key);
    if (cache != null) {
      return cache;
    }
    Polynomial<Q> prod = RING.one();
    for (final int c : mu) {
      final int[] cp = IntegerPartition.power(mu, c);
      final Polynomial<Q> t = unlY(Arrays.copyOf(cp, cp.length - 1), (n - 1) / c).substitutePower(c, n - 1);
      prod = RING.multiply(prod, t, n - 1);
    }
    prod = prod.shift(1);
    mUnlXYCache.put(key, prod);
    return prod;
  }

  // ax = lambda k, n: sum(1/mu.aut() * unlXY(mu , n) for mu in Partitions(k+1))
  protected Polynomial<Q> tx(final int n, final int k) {
    final IntegerPartition part = new IntegerPartition(k + 1);
    int[] mu;
    Polynomial<Q> sum = RING.zero();
    while ((mu = part.next()) != null) {
      sum = RING.add(sum, RING.divide(unlXY(mu, n), Q.valueOf(IntegerPartition.aut(mu))));
    }
    return sum;
  }

  // ay = lambda k, n: sum(1/mu.aut() * unlY(mu , n) for mu in Partitions(k))
  protected Polynomial<Q> ty(final int n, final int k) {
    final IntegerPartition part = new IntegerPartition(k);
    int[] mu;
    Polynomial<Q> sum = RING.zero();
    while ((mu = part.next()) != null) {
      sum = RING.add(sum, RING.divide(unlY(mu, n), Q.valueOf(IntegerPartition.aut(mu))));
    }
    return sum;
  }

  // axy = lambda k, n: sum(1/mu.aut() * unlXY(Partition(mu + [1]), n) for mu in Partitions(k))
  protected Polynomial<Q> txy(final int n, final int k) {
    final IntegerPartition part = new IntegerPartition(k);
    int[] mu;
    Polynomial<Q> sum = RING.zero();
    while ((mu = part.next()) != null) {
      final int[] mu1 = Arrays.copyOf(mu, mu.length + 1);
      mu1[mu.length] = 1;
      sum = RING.add(sum, RING.divide(unlXY(mu1, n), Q.valueOf(IntegerPartition.aut(mu))));
    }
    return sum;
  }

  // Compute the generating function for unlabeled un-rooted k-trees using the dissymmetry theorem
  /**
   * Return the number of k-trees with n nodes.
   * @param n number of nodes
   * @param k tree type
   * @return count of trees
   */
  public Z t(final int n, final int k) {
    final int m = n - k;
    return m < 0 ? Z.ZERO : tx(m, k).coeff(m).add(ty(m, k).coeff(m)).subtract(txy(m, k).coeff(m)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
