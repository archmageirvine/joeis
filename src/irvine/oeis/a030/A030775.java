package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030775.
 * @author Sean A. Irvine
 */
public class A030775 extends A030767 {

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

