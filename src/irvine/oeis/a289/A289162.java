package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289162 Number of 4-cycles in the <code>n X n</code> black bishop graph.
 * @author Sean A. Irvine
 */
public class A289162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289162() {
    super(new long[] {-1, 2, 3, -8, -2, 12, -2, -8, 3, 2}, new long[] {0, 0, 0, 6, 39, 106, 321, 644, 1402, 2412});
  }
}
