package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024352 Numbers which are the difference of two positive squares, c^2 - b^2 with 1 &lt;= b &lt; c.
 * @author Sean A. Irvine
 */
public class A024352 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 4 || (mN & 3) == 2) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
