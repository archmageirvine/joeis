package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029611 Numbers to the left of the central elements of the <code>(2,3)-Pascal</code> triangle <code>A029600</code> that are different from 2.
 * @author Sean A. Irvine
 */
public class A029611 extends A029610 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
