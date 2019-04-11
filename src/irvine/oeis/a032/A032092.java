package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032092 Number of reversible strings with <code>n-1</code> beads of 2 colors. 5 beads are black. String is not palindromic.
 * @author Sean A. Irvine
 */
public class A032092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032092() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {3, 9, 28, 60, 126, 226, 396, 636, 1001});
  }
}
