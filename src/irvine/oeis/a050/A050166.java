package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050166 Triangle T(n,k) = M(2n,k,-1), with 0 &lt;= k &lt;= n, n &gt;= 0, and array M is defined in A050144.
 * @author Sean A. Irvine
 */
public class A050166 implements Sequence {

  private Z j(final long n, final long m) {
    return Binomial.binomial(2 * n, n + m).multiply(m).divide(n);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return j(mN, mM);
  }
}

