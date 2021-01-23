package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029668 Odd numbers to the right of the central elements of the (2,1)-Pascal triangle A029653 that are different from 1.
 * @author Sean A. Irvine
 */
public class A029668 extends A029666 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven() || Z.ONE.equals(t));
    return t;
  }
}
