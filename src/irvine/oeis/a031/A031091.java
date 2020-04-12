package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031091 Position of <code>n-th 3</code> in <code>A031087</code>.
 * @author Sean A. Irvine
 */
public class A031091 extends A031087 {

  private long mN = -1;

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

