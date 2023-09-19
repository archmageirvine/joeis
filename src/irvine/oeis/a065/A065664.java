package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065664 Permutation of N induced by rotating the node 3 right in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065664 extends A065658 {

  private long mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return rotateBinFracNode(3, ++mN);
  }
}
