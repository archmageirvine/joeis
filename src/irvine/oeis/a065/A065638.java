package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065638 Permutation of N induced by rotating the node 7 left in the infinite planar binary tree. The seventh row of A065626. Inverse of A065637.
 * @author Sean A. Irvine
 */
public class A065638 extends A065626 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeLeft(7, ++mN));
  }
}
