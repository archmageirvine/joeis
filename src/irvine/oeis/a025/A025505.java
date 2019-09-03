package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a006.A006928;

/**
 * A025505 Index of <code>n-th 2</code> in <code>A006928</code>.
 * @author Sean A. Irvine
 */
public class A025505 extends A006928 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
