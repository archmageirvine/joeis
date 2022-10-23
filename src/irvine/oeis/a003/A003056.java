package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003056 n appears n+1 times. Also the array A(n,k) = n+k (n &gt;= 0, k &gt;= 0) read by antidiagonals. Also inverse of triangular numbers.
 * @author Sean A. Irvine
 */
public class A003056 extends Sequence0 {

  private long mN = -1;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC > mN) {
      ++mN;
      mC = 0;
    }
    return Z.valueOf(mN);
  }
}
