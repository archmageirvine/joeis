package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061904 Numbers n such that the iterative cycle: n -&gt; sum of digits of n^2 has only one distinct element.
 * @author Sean A. Irvine
 */
public class A061904 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s = ZUtils.digitSum(Z.valueOf(++mN).square());
      if (s == 1 || s == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
