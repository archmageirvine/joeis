package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030795 Numbers k such that A030787(k) = 3.
 * @author Sean A. Irvine
 */
public class A030795 extends A030787 {

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

