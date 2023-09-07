package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065637 Permutation of N induced by rotating the node 7 right in the infinite planar binary tree. The seventh row of A065625. Inverse of A065638.
 * @author Sean A. Irvine
 */
public class A065637 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(7, ++mN));
  }
}
