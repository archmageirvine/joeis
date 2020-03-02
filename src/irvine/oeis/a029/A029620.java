package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029620 Numbers in <code>(3,2)-Pascal</code> triangle <code>A029618</code> that are different from 2.
 * @author Sean A. Irvine
 */
public class A029620 extends A029618 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
