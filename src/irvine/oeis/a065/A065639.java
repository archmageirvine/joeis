package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065639 Permutation of N induced by rotating the node 8 right in the infinite planar binary tree. The eighth row of A065625. Inverse of A065640.
 * @author Sean A. Irvine
 */
public class A065639 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(8, ++mN));
  }
}
