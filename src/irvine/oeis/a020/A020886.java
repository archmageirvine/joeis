package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a078.A078926;

/**
 * A020886 Ordered semiperimeters of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A020886 extends A078926 {

  @Override
  public Z next() {
    while (super.next().signum() == 0) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
