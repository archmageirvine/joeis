package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065671 Permutation of N induced by rotating the node 6 left in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065671 extends A065659 {

  private long mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return rotateBinFracNode(6, ++mN);
  }
}
