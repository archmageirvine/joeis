package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202391 Indices of the smallest of four consecutive triangular numbers summing up to a square.
 * @author Sean A. Irvine
 */
public class A202391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202391() {
    super(1, new long[] {1, -7, 7}, new long[] {5, 39, 237});
  }
}
