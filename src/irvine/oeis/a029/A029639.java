package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029639 Odd numbers in the <code>(1,2)-Pascal</code> triangle <code>A029635</code> that are different from 1.
 * @author Sean A. Irvine
 */
public class A029639 extends A029638 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
