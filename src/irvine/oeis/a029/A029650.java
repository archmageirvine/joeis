package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029650 Odd numbers to the right of the central elements of the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029650 extends A029648 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
