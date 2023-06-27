package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274682 Numbers n such that 8*n-1 is a triangular number.
 * @author Sean A. Irvine
 */
public class A274682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274682() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {2, 7, 29, 44, 88});
  }
}
