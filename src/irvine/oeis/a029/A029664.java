package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029664 Odd numbers to the left of the central elements of the <code>(2,1)-Pascal</code> triangle <code>A029653</code>.
 * @author Sean A. Irvine
 */
public class A029664 extends A029662 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
