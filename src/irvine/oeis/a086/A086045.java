package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A086045 Position of the second occurrence of n in concatenated numbers (A007376, Champernowne constant).
 * @author Sean A. Irvine
 */
public class A086045 extends A007376 {

  private final StringBuilder mC = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    while (mC.indexOf(s, mC.indexOf(s) + 1) < 0) {
      for (int k = 0; k < 100; ++k) {
        mC.append(super.next());
      }
    }
    return Z.valueOf(mC.indexOf(s, mC.indexOf(s) + 1) + 1);
  }
}
