package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029623 Even numbers in (3,2)-Pascal triangle A029618.
 * @author Sean A. Irvine
 */
public class A029623 extends A029618 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
