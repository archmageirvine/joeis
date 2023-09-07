package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065632 Permutation of N induced by rotating the node 4 left in the infinite planar binary tree. The fourth row of A065626. Inverse of A065631.
 * @author Sean A. Irvine
 */
public class A065632 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(4, ++mN));
  }
}
