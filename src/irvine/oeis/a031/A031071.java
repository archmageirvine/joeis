package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031071 Position of <code>n-th 3</code> in <code>A031067</code>.
 * @author Sean A. Irvine
 */
public class A031071 extends A031067 {

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

