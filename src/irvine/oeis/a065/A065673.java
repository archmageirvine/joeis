package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065673 Permutation of N induced by rotating the node 7 left in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065673 extends A065659 {

  private long mN = 0;

  @Override
  public Z next() {
    return rotateBinFracNode(7, ++mN);
  }
}
