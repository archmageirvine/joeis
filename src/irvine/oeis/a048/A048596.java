package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A048596 Numbers k such that (k mod (sum of decimal digits of k)) divides k.
 * @author Sean A. Irvine
 */
public class A048596 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      final long m = ++mN % ZUtils.digitSum(mN);
      if (m != 0 && mN % m == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

