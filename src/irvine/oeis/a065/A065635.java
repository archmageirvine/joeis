package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065635 Permutation of N induced by rotating the node 6 right in the infinite planar binary tree. The sixth row of A065625. Inverse of A065636.
 * @author Sean A. Irvine
 */
public class A065635 extends A065625 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(rotateNodeRight(6, ++mN));
  }
}
