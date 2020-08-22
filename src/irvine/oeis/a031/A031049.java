package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031049 Position of n-th 3 in A031045.
 * @author Sean A. Irvine
 */
public class A031049 extends A031045 {

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

