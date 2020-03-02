package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029661 Even numbers to the right of the central numbers of the <code>(2,1)-Pascal</code> triangle <code>A029653</code>.
 * @author Sean A. Irvine
 */
public class A029661 extends A029666 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
