package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031181 Numbers having period-3 3-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031181 extends A031178 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
