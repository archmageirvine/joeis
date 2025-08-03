package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386319 Triangle read by rows where row n is the start, corner and end vertex numbers of a triangular spiral with n sides on a triangular grid, starting from 1 and working inwards (0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A386319 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0 ? Z.ONE : Z.valueOf(mM * (2 * mN - mM + 1) / 2);
  }
}

