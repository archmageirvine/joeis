package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.a008.A008846;

/**
 * A360280 Squares that are the hypotenuse of a primitive Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A360280 extends A008846 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

