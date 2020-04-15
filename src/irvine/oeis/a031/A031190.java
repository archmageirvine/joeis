package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031190.
 * @author Sean A. Irvine
 */
public class A031190 extends A031186 {

  @Override
  public Z next() {
    while (!Z.SIX.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
