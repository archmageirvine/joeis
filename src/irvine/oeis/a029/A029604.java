package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029604 Odd numbers in the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029604 extends A029600 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
