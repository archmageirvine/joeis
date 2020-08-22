package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289161 Number of 3-cycles in the n X n black bishop graph.
 * @author Sean A. Irvine
 */
public class A289161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289161() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 2, 6, 24, 50, 114, 196});
  }
}
