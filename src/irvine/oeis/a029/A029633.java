package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029633 Numbers to right of central elements of the (3,2)-Pascal triangle A029618 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029633 extends A029632 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
