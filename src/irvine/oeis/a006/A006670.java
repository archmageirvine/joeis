package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006670 Edge-distinguishing chromatic number of path with n nodes.
 * @author Sean A. Irvine
 */
public class A006670 implements Sequence {

  private long mN = 0;
  private long mR = 0;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    while (true) {
      if ((mR & 1) == 0) {
        if (mR * mR - mR + 2 < 2 * mN && mR * mR + 4 >= 2 * mN) {
          return Z.valueOf(mR);
        }
      } else {
        if (mR * mR - 2 * mR + 5 < 2 * mN && mR * mR + mR + 2 >= 2 * mN) {
          return Z.valueOf(mR);
        }
      }
      ++mR;
    }
  }
}
