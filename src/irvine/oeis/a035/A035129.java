package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035129 Rotating digits of a(n)^3 left once still yields a cube.
 * @author Sean A. Irvine
 */
public class A035129 extends A035131 {

  @Override
  public Z next() {
    return super.next().root(3);
  }
}
