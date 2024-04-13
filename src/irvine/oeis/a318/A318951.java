package irvine.oeis.a318;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A318951 Array read by rows: T(n,k) is the number of nonisomorphic n X n matrices with nonnegative integer entries and row sums k under row and column permutations, (n &gt;= 1, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A318951 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A318951(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A318951() {
    super(1);
  }

  // After Andrew Howroyd

  private static final PolynomialRingField<Z> RINGZ = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private Z permCount(final int[] v) {
    Z m = Z.ONE;
    int s = 0;
    int k = 0;
    for (int i = 0; i < v.length; ++i) {
      final int t = v[i];
      k = i > 0 && t == v[i - 1] ? k + 1 : 1;
      m = m.multiply(t * (long) k);
      s += t;
    }
    return mF.factorial(s).divide(m);
  }

  private Z k(final int[] q, final int t, final int k) {
    Polynomial<Z> product = RINGZ.one();
    for (final int v : q) {
      final int g = IntegerUtils.gcd(t, v);
      product = RINGZ.multiply(product, RINGZ.pow(RINGZ.oneMinusXToTheN(v / g), g, k), k);
    }
    return RINGZ.coeff(RINGZ.one(), product, k);
  }

  protected Z rowSumMats(final int n, final int m, final int k) {
    Z sum = Z.ZERO;
    final IntegerPartition parts = new IntegerPartition(m);
    int[] q;
    while ((q = parts.next()) != null) {
      final Polynomial<Q> ks = RING.empty();
      ks.add(Q.ZERO);
      for (int t = 1; t <= n; ++t) {
        ks.add(new Q(k(q, t, k), Z.valueOf(t)));
      }
      sum = sum.add(RING.exp(ks, n).coeff(n).multiply(permCount(q)).toZ());
    }
    return sum.divide(mF.factorial(m));
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return rowSumMats(mM, mM, mN - mM);
  }
}
