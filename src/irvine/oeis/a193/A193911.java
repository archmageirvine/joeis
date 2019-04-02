package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193911 Sums of the diagonals of the matrix formed by listing the h-Stohr sequences in increasing order.
 * @author Sean A. Irvine
 */
public class A193911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193911() {
    super(new long[] {-2, 4, 1, -6, 2, 2}, new long[] {1, 3, 7, 14, 25, 43});
  }
}
