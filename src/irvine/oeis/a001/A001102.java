package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001102 Numbers k such that k <code>/</code> (sum of digits of <code>k)</code> is a square.
 * @author Sean A. Irvine
 */
public class A001102 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long ds = ZUtils.digitSum(mN);
      if (mN.mod(ds) == 0 && Z.ZERO.equals(mN.divide(ds).sqrtAndRemainder()[1])) {
        return mN;
      }
    }
  }
}

