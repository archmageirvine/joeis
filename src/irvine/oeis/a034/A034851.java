package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A034851 Rows of Losanitsch's triangle T(n, k), n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A034851 extends AbstractSequence {

  /** Construct the sequence. */
  public A034851() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    return Binomial.binomial(n, k).add(Binomial.binomial(n & 1, k & 1).multiply(Binomial.binomial(n / 2, k / 2))).divide2();
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
