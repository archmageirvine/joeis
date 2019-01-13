package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003658.
 * @author Sean A. Irvine
 */
public class A003658 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN & 3;
      if (r == 1) {
        if (LongUtils.isSquareFree(mN)) {
          return Z.valueOf(mN);
        }
      } else if (r == 0 && ((mN / 4) & 3) > 1 && LongUtils.isSquareFree(mN / 4)) {
        return Z.valueOf(mN);
      }
    }
  }
}
