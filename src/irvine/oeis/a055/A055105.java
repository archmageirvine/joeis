package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055105 Triangle read by rows: T(n,k) = number of noncommutative symmetric polynomials of degree n that have exactly k different variables appearing in each monomial and which generate the algebra of all noncommutative symmetric polynomials (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A055105 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A055105(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A055105() {
    super(1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  protected int mM = 0;

  private Polynomial<Z> b(final int k, final int n) {
    final Z[] c = new Z[n + 1];
    c[0] = Z.ONE;
    for (int i = 1; i <= n; ++i) {
      c[i] = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        c[i] = c[i].add(Stirling.secondKind(i, j));
      }
    }
    return Polynomial.create(c);
  }

  protected Z a(final int k, final int n) {
    final Polynomial<Z> bk1 = b(k - 1, n);
    final Polynomial<Z> bk = b(k, n);
    return RING.coeff(RING.one(), bk1, n).subtract(RING.coeff(RING.one(), bk, n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mM, mN);
  }
}
