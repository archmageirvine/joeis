package irvine.oeis.a370;

import irvine.math.z.Z;

/**
 * A370771 Triangle read by rows: T(n,k) is the number of k-trees with n unlabeled nodes rooted at a front.
 * @author Sean A. Irvine
 */
public class A370771 extends A370770 {

  /**
   * Return the number of k-trees with n nodes.
   * @param n number of nodes
   * @param k tree type
   * @return count of trees
   */
  public Z t(final int n, final int k) {
    final int m = n - k;
    return m < 0 ? Z.ZERO : ty(m, k).coeff(m).toZ();
  }
}
