package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030552 Position of n-th 3 in A030548.
 * @author Sean A. Irvine
 */
public class A030552 extends A030548 {

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

