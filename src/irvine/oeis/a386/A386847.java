package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386847 a(n) is the number of sets of distinct five-cuboid combinations that fill an n X n X n cube excluding combinations that contain strict cuboids.
 * @author Sean A. Irvine
 */
public class A386847 extends A386848 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

