package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063662 Starting with 0, select the next number having in decimal notation at least one common digit.
 * @author Sean A. Irvine
 */
public class A063662 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN < 0) {
      mN = 0;
    } else {
      final int syn = LongUtils.syndrome(mN);
      long k = mN;
      while (true) {
        if ((syn & LongUtils.syndrome(++k)) != 0) {
          mN = k;
          break;
        }
      }
    }
    return Z.valueOf(mN);
  }
}
