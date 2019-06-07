package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034851 Rows of Losanitsch's triangle <code>T(n, k), n &gt;= 0, 0 &lt;= k &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A034851 implements Sequence {

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
