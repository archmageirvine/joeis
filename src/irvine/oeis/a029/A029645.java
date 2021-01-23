package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029645 Numbers to the left of the central elements of the (1,2)-Pascal triangle A029635 that are different from 1.
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
