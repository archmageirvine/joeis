package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030571 Position of n-th 3 in A030567.
 * @author Sean A. Irvine
 */
public class A030571 extends A030567 {

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

