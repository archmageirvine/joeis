package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065629 Permutation of N induced by rotating the node 3 right in the infinite planar binary tree. The third row of A065625. Inverse of A065630.
 * @author Sean A. Irvine
 */
public class A065629 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(3, ++mN));
  }
}
