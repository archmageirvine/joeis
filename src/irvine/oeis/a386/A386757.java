package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386757 a(n) is the number of sets of noncongruent five-cuboid combinations that fill an n X n X n cube excluding combinations that contain cube-shaped cuboids.
 * @author Sean A. Irvine
 */
public class A386757 extends A386779 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

