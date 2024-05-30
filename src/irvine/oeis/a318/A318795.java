package irvine.oeis.a318;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a052.A052107;

/**
 * A318795 Array read by antidiagonals: T(n,k) is the number of inequivalent nonnegative integer n X n matrices with sum of elements equal to k, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A318795 extends A052107 {

  /** Construct the sequence. */
  public A318795() {
    this(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A318795(final int offset) {
    super(offset);
  }

  // After Andrew Howroyd

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  private Polynomial<Q> k(final int[] q, final int t, final int k) {
    Polynomial<Q> prod = RING_Y.one();
    for (final int j : q) {
      final Polynomial<Q> f = RING_Y.pow(RING_Y.oneMinusXToTheN(IntegerUtils.lcm(t, j)), Functions.GCD.i(t, j), k);
      prod = RING_Y.multiply(prod, f, k);
    }
    return RING_Y.series(RING_Y.one(), prod, k);
  }

  protected Z m(final int m, final int n, final int k) {
    Q sum = Q.ZERO;
    final IntegerPartition part = new IntegerPartition(m);
    int[] q;
    final PolynomialRingField<Polynomial<Q>> fld = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, k));
    while ((q = part.next()) != null) {
      Polynomial<Polynomial<Q>> s = fld.zero();
      for (int t = 1; t <= n; ++t) {
        s = fld.add(s, fld.monomial(RING_Y.divide(k(q, t, k), new Q(t)), t));
      }
      s = fld.exp(s, n);
      sum = sum.add(s.coeff(n).coeff(k).multiply(IntegerPartition.permCount(q, 1)));
    }
    return sum.divide(Functions.FACTORIAL.z(m)).toZ();
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = ++mN;
    }
    return m(mN - mM + 1, mN - mM + 1, mM);
  }
}
