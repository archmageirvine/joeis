package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029643 Even numbers to the right of the central numbers of the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029643 extends A029648 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
