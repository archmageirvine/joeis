package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029624 Odd numbers in <code>(3,2)-Pascal</code> triangle <code>A029618</code> that are different from 3.
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
