package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031296 Position of n-th 9 in A007376.
 * @author Sean A. Irvine
 */
public class A031296 extends A007376 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.NINE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

