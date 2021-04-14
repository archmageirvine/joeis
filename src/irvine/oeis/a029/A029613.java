package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029613 Even numbers (not equal to 2) to the left of the central elements of the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029613 extends A029611 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t;
  }
}
