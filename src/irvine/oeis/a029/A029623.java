package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029623 Even numbers in <code>(3,2)-Pascal</code> triangle <code>A029618</code>.
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
