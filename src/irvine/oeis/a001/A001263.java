package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.triangle.DirectArray;

/**
 * A001263 Triangle of Narayana numbers T(n,k) = C(n-1,k-1)*C(n,k-1)/k with 1 &lt;= k &lt;= n, read by rows. Also called the Catalan triangle.
 * @author Sean A. Irvine
 */
public class A001263 extends Sequence1 implements DirectArray {

  private long mN = 0;
  private long mK = 0;

  @Override
  public Z a(final int n, final int k) {
    return Binomial.binomial(n - 1, k - 1).multiply(Binomial.binomial(n, k - 1)).divide(k);
  }

  private Z t(final long n, final long k) {
    return Binomial.binomial(n - 1, k - 1).multiply(Binomial.binomial(n, k - 1)).divide(k);
  }

  @Override
  public Z next() {
    if (mK == mN) {
      ++mN;
      mK = 0;
    }
    return t(mN, ++mK);
  }
}
