package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178523 The path length of the Fibonacci tree of order n.
 * @author Sean A. Irvine
 */
public class A178523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178523() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {0, 0, 2, 6, 16});
  }
}
