package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142354 Triangle read by rows: T(n,k) = n * k * (n + k) mod 10, 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A142354 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((((mN * mM) % 10) * (mN + mM)) % 10);
  }
}

