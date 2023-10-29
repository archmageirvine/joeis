package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066564 Numbers that when incremented by the sum of their digits produce a square.
 * @author Sean A. Irvine
 */
public class A066564 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquare(++mN + ZUtils.digitSum(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
