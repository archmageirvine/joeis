package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029646 Odd numbers to the left of the central elements of the <code>(1,2)-Pascal</code> triangle <code>A029635</code>.
 * @author Sean A. Irvine
 */
public class A029646 extends A029644 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
