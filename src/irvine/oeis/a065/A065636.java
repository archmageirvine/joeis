package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065636 Permutation of N induced by rotating the node 6 left in the infinite planar binary tree. The sixth row of A065626. Inverse of A065635.
 * @author Sean A. Irvine
 */
public class A065636 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(6, ++mN));
  }
}
