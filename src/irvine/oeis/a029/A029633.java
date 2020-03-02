package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029633 Numbers to right of central elements of the <code>(3,2)-Pascal</code> triangle <code>A029618</code> that are different from 2.
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
