package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065633 Permutation of N induced by rotating the node 5 right in the infinite planar binary tree. The fifth row of A065625. Inverse of A065634.
 * @author Sean A. Irvine
 */
public class A065633 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(5, ++mN));
  }
}
