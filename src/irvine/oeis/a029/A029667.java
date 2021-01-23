package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029667 Numbers to the left of the central elements of the (2,1)-Pascal triangle A029653 that are different from 2.
 * @author Sean A. Irvine
 */
public class A029667 extends A029662 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (Z.TWO.equals(t));
    return t;
  }
}
