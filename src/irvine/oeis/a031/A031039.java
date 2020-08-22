package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031039 Position of n-th 3 in A031035.
 * @author Sean A. Irvine
 */
public class A031039 extends A031035 {

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

