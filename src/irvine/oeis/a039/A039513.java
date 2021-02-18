package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039513 2i + 1 such that A039508(i) = 2.
 * @author Sean A. Irvine
 */
public class A039513 extends A039508 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
