package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029603 Numbers in the (2,3)-Pascal triangle A029600 that are different from 3.
 * @author Sean A. Irvine
 */
public class A029603 extends A029600 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
