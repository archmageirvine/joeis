package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032091 Number of reversible strings with n-1 beads of 2 colors. 4 beads are black. String is not palindromic.
 * @author Sean A. Irvine
 */
public class A032091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032091() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {2, 6, 16, 32, 60, 100, 160});
  }
}
