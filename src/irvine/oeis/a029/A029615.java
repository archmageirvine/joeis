package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029615 Numbers to the right of the central elements of the <code>(2,3)-Pascal</code> triangle <code>A029600</code> that are different from 3.
 * @author Sean A. Irvine
 */
public class A029615 extends A029614 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.THREE.equals(t));
    return t;
  }
}
