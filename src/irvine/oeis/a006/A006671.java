package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006671 Edge-distinguishing chromatic number of cycle with n nodes.
 * @author Sean A. Irvine
 */
public class A006671 implements Sequence {

  private long mN = 2;
  private long mR = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if ((mR & 1) == 0) {
        if (mR * mR - mR < 2 * mN && mR * mR >= 2 * mN) {
          return Z.valueOf(mR);
        }
      } else {
        if (mR * mR - 2 * mR + 1 < 2 * mN && mR * mR + mR >= 2 * mN) {
          return Z.valueOf(mR);
        }
      }
      ++mR;
    }
  }
}
