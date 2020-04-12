package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031031 Position of <code>n-th 3</code> in <code>A031027</code>.
 * @author Sean A. Irvine
 */
public class A031031 extends A031027 {

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

