package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030715.
 * @author Sean A. Irvine
 */
public class A030715 extends A030707 {

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

