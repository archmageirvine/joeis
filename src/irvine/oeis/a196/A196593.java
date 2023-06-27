package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196593 Number of fixed tree-like convex polyominoes.
 * @author Sean A. Irvine
 */
public class A196593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196593() {
    super(1, new long[] {2, -9, 16, -14, 6}, new long[] {1, 2, 6, 18, 51});
  }
}
