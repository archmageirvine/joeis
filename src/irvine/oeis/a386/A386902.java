package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386902 a(n) is the number of distinct five-cuboid combinations that fill an n X n X n with only strict cuboids.
 * @author Sean A. Irvine
 */
public class A386902 extends A386903 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
