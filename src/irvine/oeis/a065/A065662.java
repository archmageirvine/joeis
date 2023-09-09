package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065662 Permutation of N induced by rotating the node 2 right in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065662 extends A065658 {

  private long mN = 0;

  @Override
  public Z next() {
    return rotateBinFracNode(2, ++mN);
  }
}
