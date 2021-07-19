package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A049106 Ratio from A049102.
 * @author Sean A. Irvine
 */
public class A049106 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN);
      if (prod != 0) {
        final long t = prod * ZUtils.digitSum(mN);
        if (mN % t == 0) {
          return Z.valueOf(mN / t);
        }
      }
    }
  }
}

