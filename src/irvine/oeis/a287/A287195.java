package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287195 Independence and clique covering number of the n-triangular honeycomb acute knight graph.
 * @author Sean A. Irvine
 */
public class A287195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287195() {
    super(1, new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 3, 3, 5, 9, 9, 12});
  }
}
