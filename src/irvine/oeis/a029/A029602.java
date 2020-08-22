package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029602 Numbers in the (2,3)-Pascal triangle A029600 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029602 extends A029600 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
