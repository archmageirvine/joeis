package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031203 Numbers having period-3 7-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031203 extends A031200 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
