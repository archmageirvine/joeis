package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029624 Odd numbers in (3,2)-Pascal triangle A029618 that are different from 3.
 * @author Sean A. Irvine
 */
public class A029624 extends A029621 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
