package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029625 Even numbers in (3,2)-Pascal triangle A029618 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029625 extends A029620 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isOdd());
    return t;
  }
}
