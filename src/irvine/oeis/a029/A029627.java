package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029627 Even numbers to right of central numbers of the (3,2)-Pascal triangle A029618.
 * @author Sean A. Irvine
 */
public class A029627 extends A029632 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
