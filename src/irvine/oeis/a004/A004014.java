package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004014.
 * @author Sean A. Irvine
 */
public class A004014 extends A004013 {

  @Override
  public Z next() {
    while (Z.ZERO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
