package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065627 Permutation of N induced by rotating the node 2 right in the infinite planar binary tree. The second row of A065625. Inverse of A065628.
 * @author Sean A. Irvine
 */
public class A065627 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(2, ++mN));
  }
}
