package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A034261 Infinite square array f(a,b) = C(a+b,b+1)*(a*b+a+1)/(b+2), a, b &gt;= 0, read by antidiagonals. Equivalently, triangular array T(n,k) = f(k,n-k), 0 &lt;= k &lt;= n, read by rows.
 * @author Sean A. Irvine
 */
public class A034261 extends AbstractSequence {

  /** Construct the sequence. */
  public A034261() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  protected Z f(final long n, final long m) {
    return Binomial.binomial(n + m, m + 1).multiply(n * m + n + 1).divide(m + 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return f(mM, mN - mM);
  }
}

