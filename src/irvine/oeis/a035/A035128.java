package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035128 Rotating digits of a(n)^3 right once still yields a cube.
 * @author Sean A. Irvine
 */
public class A035128 extends A035130 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
