package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065075 Sum of digits of the sum of the preceding numbers.
 * @author Sean A. Irvine
 */
public class A065075 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final long t = mSum.isZero() ? 1 : ZUtils.digitSum(mSum);
    mSum = mSum.add(t);
    return Z.valueOf(t);
  }
}

