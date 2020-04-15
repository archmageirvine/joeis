package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031202.
 * @author Sean A. Irvine
 */
public class A031202 extends A031200 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
