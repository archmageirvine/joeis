package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029611 Numbers to the left of the central elements of the (2,3)-Pascal triangle A029600 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029611 extends A029610 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
