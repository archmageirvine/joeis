package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065665 Permutation of N induced by rotating the node 3 left in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065665 extends A065659 {

  private long mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return rotateBinFracNode(3, ++mN);
  }
}
