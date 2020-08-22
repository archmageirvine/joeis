package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030377 Position of n-th 3 in A030373.
 * @author Sean A. Irvine
 */
public class A030377 extends A030373 {

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

