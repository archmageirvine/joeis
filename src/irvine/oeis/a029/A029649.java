package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029649 Numbers to the right of the central elements of the <code>(1,2)-Pascal</code> triangle <code>A029635</code> that are different from 2.
 * @author Sean A. Irvine
 */
public class A029649 extends A029648 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
