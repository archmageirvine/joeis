package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065634 Permutation of N induced by rotating the node 5 left in the infinite planar binary tree. The fifth row of A065626. Inverse of A065633.
 * @author Sean A. Irvine
 */
public class A065634 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(5, ++mN));
  }
}
