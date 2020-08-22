package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029669 Odd numbers in the (2,1)-Pascal triangle A029653.
 * @author Sean A. Irvine
 */
public class A029669 extends A029653 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
