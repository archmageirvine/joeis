package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290698 Number of minimal edge covers in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A290698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290698() {
    super(new long[] {1, -1, -4, -3, 5, 11, 12, 5, 2}, new long[] {2, 14, 74, 286, 1157, 4778, 19623, 80478, 330293});
  }
}
