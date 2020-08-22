package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029642 Distinct odd numbers in the (1,2)-Pascal triangle A029635.
 * @author Sean A. Irvine
 */
public class A029642 extends A029636 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
