package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065628 Permutation of N induced by rotating the node 2 left in the infinite planar binary tree. The second row of A065626. Inverse of A065627.
 * @author Sean A. Irvine
 */
public class A065628 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(2, ++mN));
  }
}
