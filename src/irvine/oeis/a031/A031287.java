package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A031287 Position of <code>n-th 0</code> in <code>A007376</code>.
 * @author Sean A. Irvine
 */
public class A031287 extends A007376 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

