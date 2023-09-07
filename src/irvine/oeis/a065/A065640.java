package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065640 Permutation of N induced by rotating the node 8 left in the infinite planar binary tree. The eighth row of A065626. Inverse of A065639.
 * @author Sean A. Irvine
 */
public class A065640 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(8, ++mN));
  }
}
