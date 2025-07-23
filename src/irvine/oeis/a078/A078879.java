package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078879 Triangle read by rows: T(n,k) = ceiling(k^2 / n), 0 &lt; k &lt;= n.
 * @author Sean A. Irvine
 */
public class A078879 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mM == mN ? Z.ZERO : Z.valueOf(mM).square().add(mN - 1).divide(mN);
  }
}
