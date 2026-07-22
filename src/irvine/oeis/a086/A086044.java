package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A086044 Position of first occurrence of n in concatenated numbers (A033307, Champernowne constant).
 * @author Sean A. Irvine
 */
public class A086044 extends A007376 {

  private final StringBuilder mC = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    while (mC.indexOf(s) < 0) {
      for (int k = 0; k < 100; ++k) {
        mC.append(super.next());
      }
    }
    return Z.valueOf(mC.indexOf(s) + 1);
  }
}
