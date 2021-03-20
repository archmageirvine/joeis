package irvine.oeis.a089;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089434 Triangle read by rows: T(n,k) (n &gt;= 2, k &gt;= 0) is the number of non-crossing connected graphs on n nodes on a circle, having k interior faces. Rows are indexed 2,3,4,...; columns are indexed 0,1,2,....
 * @author Sean A. Irvine
 */
public class A089434 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(n + m - 2, m).multiply(Binomial.binomial(3 * n - 3, n - 2 - m)).divide(n - 1);
  }

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
