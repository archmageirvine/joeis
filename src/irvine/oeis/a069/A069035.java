package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069035 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (true) {
      m += mN;
      if (ZUtils.digitSum(m) == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

