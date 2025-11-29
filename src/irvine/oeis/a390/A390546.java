package irvine.oeis.a390;

import irvine.oeis.a389.A389255;

/**
 * A390546 Triangle read by rows: T(n,k) = number of heapable permutations of length n that contain the max element on position k (positions starting from 0).
 * @author Sean A. Irvine
 */
public class A390546 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] == p.length - 1) {
        return k + 1;
      }
    }
    return 0;
  }
}
