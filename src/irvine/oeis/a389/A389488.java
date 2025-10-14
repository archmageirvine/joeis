package irvine.oeis.a389;

import irvine.oeis.a388.A388139;

/**
 * A386382 Total number of runs in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A389488 extends A388139 {

  @Override
  protected long count(final int[] p) {
    // Length of leading run
    for (int k = 1; k < p.length; ++k) {
      if (p[k] < p[k - 1]) {
        return k;
      }
    }
    return p.length;
  }
}
