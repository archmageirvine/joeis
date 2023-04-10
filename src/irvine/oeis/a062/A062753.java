package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062753 Multiples of 4 whose sum of digits is also a multiple of 4.
 * @author Sean A. Irvine
 */
public class A062753 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if ((ZUtils.digitSum(mN) & 3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

