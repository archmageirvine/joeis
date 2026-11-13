package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142457 Triangle read by rows: T(n,k) = n * k * (n + k) mod 11, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A142457 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((((mN * mM) % 11) * (mN + mM)) % 11);
  }
}

