package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a006.A006928;

/**
 * A022298 Exactly half of first n terms of <code>A006928</code> are <code>1</code>'s (not known to be infinite).
 * @author Sean A. Irvine
 */
public class A022298 extends A006928 {

  private long mA = 0; // Counts 2 * the number of 1s
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      mN += 2;
      if (mA == mN) {
        return Z.valueOf(mA);
      }
    }
  }
}
