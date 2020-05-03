package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031427 Least term in period of continued fraction for <code>sqrt(n)</code> is 3.
 * @author Sean A. Irvine
 */
public class A031427 extends A031424 {

  @Override
  public Z next() {
    while (!Z.THREE.equals(super.next())) {
      // do nothing
    }
    return mN;
  }
}
