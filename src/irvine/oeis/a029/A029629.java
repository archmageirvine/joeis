package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029629 Numbers to left of central elements of the (3,2)-Pascal triangle A029618 that are different from 3.
 * @author Sean A. Irvine
 */
public class A029629 extends A029628 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
