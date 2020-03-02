package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029638 Numbers in the <code>(1,2)-Pascal</code> triangle <code>A029635</code> that are different from 1.
 * @author Sean A. Irvine
 */
public class A029638 extends A029635 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.ONE.equals(t));
    return t;
  }
}
