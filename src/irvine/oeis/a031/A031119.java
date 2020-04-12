package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031119 Position of <code>n-th 7</code> in <code>A031111</code>.
 * @author Sean A. Irvine
 */
public class A031119 extends A031111 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SEVEN.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

