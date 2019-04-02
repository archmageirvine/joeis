package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108361 Diagonal sums of number triangle A108359.
 * @author Sean A. Irvine
 */
public class A108361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108361() {
    super(new long[] {-1, -1, 0, 4, 2, -2, -4, 0, 3}, new long[] {1, 1, 2, 4, 7, 13, 25, 47, 90});
  }
}
