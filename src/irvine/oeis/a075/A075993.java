package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075993 Triangle read by rows: T(n,m) is the number of integers k such that floor(n/k) = m, n &gt;= 1, k = 1..n.
 * @author Sean A. Irvine
 */
public class A075993 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN / mM - mN / (mM + 1));
  }
}
