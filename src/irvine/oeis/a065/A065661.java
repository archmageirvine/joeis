package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065661 Permutation of N induced by rotating the node 1 (the top node) left in the infinite planar binary tree shown at A065658.
 * @author Sean A. Irvine
 */
public class A065661 extends A065659 {

  private long mN = 0;

  @Override
  public Z next() {
    return rotateBinFracNode(1, ++mN);
  }
}
