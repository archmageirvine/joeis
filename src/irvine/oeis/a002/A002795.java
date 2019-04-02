package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002795 Denominators of convergents to Lehmer's constant.
 * @author Sean A. Irvine
 */
public class A002795 extends A002794 {

  @Override
  public Z next() {
    return nextConvergent().den();
  }
}
