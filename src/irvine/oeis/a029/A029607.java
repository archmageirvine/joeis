package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029607 Even numbers in the (2,3)-Pascal triangle A029600 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029607 extends A029605 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
