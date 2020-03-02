package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029656 Numbers in the <code>(2,1)-Pascal</code> triangle <code>A029653</code> that are different from 1.
 * @author Sean A. Irvine
 */
public class A029656 extends A029653 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.ONE.equals(t));
    return t;
  }
}
