package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029617 Table read by rows: list of even numbers to the right of the central elements of the (2,3)-Pascal triangle A029600.
 * @author Sean A. Irvine
 */
public class A029617 extends A029614 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (!t.isEven());
    return t;
  }
}
