package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031196.
 * @author Sean A. Irvine
 */
public class A031196 extends A031195 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
