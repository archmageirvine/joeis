package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029621 Numbers in <code>(3,2)-Pascal</code> triangle <code>A029618</code> that are different from 3.
 * @author Sean A. Irvine
 */
public class A029621 extends A029618 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
