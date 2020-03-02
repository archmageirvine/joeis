package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029602 Numbers in the <code>(2,3)-Pascal</code> triangle <code>A029600</code> that are different from 2.
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
