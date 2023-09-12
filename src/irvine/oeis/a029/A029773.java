package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029773 Squares k^2 in which the digits of k appear.
 * @author Sean A. Irvine
 */
public class A029773 extends A029772 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
