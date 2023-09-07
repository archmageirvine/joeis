package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065631 Permutation of N induced by rotating the node 4 right in the infinite planar binary tree. The fourth row of A065625. Inverse of A065632.
 * @author Sean A. Irvine
 */
public class A065631 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(4, ++mN));
  }
}
