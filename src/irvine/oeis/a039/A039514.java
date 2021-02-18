package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039514 2i + 1 such that A039508(i) = 3.
 * @author Sean A. Irvine
 */
public class A039514 extends A039508 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
