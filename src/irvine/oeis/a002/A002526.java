package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002526 Number of permutations of length n within distance 3 of a fixed permutation.
 * @author Sean A. Irvine
 */
public class A002526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002526() {
    super(new long[] {1, 2, 0, 2, 4, -2, -10, -16, -2, 8, 10, 0, 2, 2}, new long[] {1, 1, 2, 6, 24, 78, 230, 675, 2069, 6404, 19708, 60216, 183988, 563172});
  }
}
