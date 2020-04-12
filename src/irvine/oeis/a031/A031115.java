package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031115 Position of <code>n-th 3</code> in <code>A031111</code>.
 * @author Sean A. Irvine
 */
public class A031115 extends A031111 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.THREE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

