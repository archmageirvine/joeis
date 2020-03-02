package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029645 Numbers to the left of the central elements of the <code>(1,2)-Pascal</code> triangle <code>A029635</code> that are different from 1.
 * @author Sean A. Irvine
 */
public class A029645 extends A029644 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.ONE.equals(t));
    return t;
  }
}
