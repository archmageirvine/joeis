package irvine.oeis.a107;
// manually tri 2021-09-03

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A107985 Triangle read by rows: T(n,k) = (k+1)(n+2)(n-k+1)/2 for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A107985 extends Sequence0 {

  private long mN = 0;
  private long mK = -1;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return Z.valueOf(mK + 1).multiply(Z.valueOf(mN + 2)).multiply(Z.valueOf(mN - mK + 1)).divide2();
  }
}
