package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029613 Even numbers (not equal to <code>2)</code> to the left of the central elements of the <code>(2,3)-Pascal</code> triangle <code>A029600</code>.
 * @author Sean A. Irvine
 */
public class A029613 extends A029611 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
