package irvine.oeis.a008;

import java.util.HashMap;
import java.util.Map;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A008300 Triangle read by rows: T(n,k) (n &gt;= 0, 0 &lt;= k &lt;= n) gives number of {0,1} n X n matrices with all row and column sums equal to k.
 * @author Sean A. Irvine
 */
public class A008300 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A008300(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A008300() {
    super(0);
  }

  // After Andrew Howroyd

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  private void acc(final Map<Polynomial<Z>, Z> m, final Polynomial<Z> p, final Z v) {
    final Z t = m.get(p);
    m.put(p, t == null ? v : t.add(v));
  }

  private void recurse(final Map<Polynomial<Z>, Z> m, final int i, final Polynomial<Z> p, final Z v, final int e) {
    if (i < 0) {
      if (e == 0) {
        acc(m, p, v);
      }
    } else {
      final Z t = p.coeff(i);
      final int min = t.min(Z.valueOf(e)).intValueExact();
      for (int j = 0; j <= min; ++j) {
        recurse(m, i - 1, RING.add(p, Polynomial.create(-j, j).shift(i)), Binomial.binomial(t, Z.valueOf(j)).multiply(v), e - j);
      }
    }
  }

  protected Z t(final int n, final int k) {
    if (k > n) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    HashMap<Polynomial<Z>, Z> m = new HashMap<>();
    m.put(Polynomial.create(n), Z.ONE);
    for (int r = 1; r <= n; ++r) {
      final HashMap<Polynomial<Z>, Z> res = new HashMap<>();
      for (final Map.Entry<Polynomial<Z>, Z> e : m.entrySet()) {
        recurse(res, k - 1, e.getKey(), e.getValue(), k);
      }
      m = res;
    }
    return ZUtils.sum(m.values());
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
