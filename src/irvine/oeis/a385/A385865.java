package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A385865 Triangle read by rows where T(n,k), for 1 &lt;= k &lt; n, is the column number where (n-k)^2 occurs in an n X n grid filled rowwise with the numbers 1 to n^2.
 * @author Sean A. Irvine
 */
public class A385865 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf((mM * mM - 1) % mN + 1);
  }
}
