package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A077266 Triangle of number of zeros when n is written in base k (2 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A077266 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return Z.valueOf(ZUtils.digitCounts(mN, mM)[0]);
  }
}
