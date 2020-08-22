package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031022 Position of n-th 3 in A031018.
 * @author Sean A. Irvine
 */
public class A031022 extends A031018 {

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

