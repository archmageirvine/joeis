package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031058 Position of <code>n-th 0</code> in <code>A031057</code>.
 * @author Sean A. Irvine
 */
public class A031058 extends A031057 {

  private long mN = 0;

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

