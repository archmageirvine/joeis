package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029634 Odd numbers to right of central elements of the <code>(3,2)-Pascal</code> triangle <code>A029618</code>.
 * @author Sean A. Irvine
 */
public class A029634 extends A029632 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
