package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029606 Odd numbers in the (2,3)-Pascal triangle A029600 that are different from 3.
 * @author Sean A. Irvine
 */
public class A029606 extends A029604 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
