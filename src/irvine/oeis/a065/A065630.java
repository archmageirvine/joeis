package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065630 Permutation of N induced by rotating the node 3 left in the infinite planar binary tree. The third row of A065626. Inverse of A065629.
 * @author Sean A. Irvine
 */
public class A065630 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(3, ++mN));
  }
}
