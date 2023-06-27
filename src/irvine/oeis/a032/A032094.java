package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032094 Number of reversible strings with n-1 beads of 2 colors. 7 beads are black. String is not palindromic.
 * @author Sean A. Irvine
 */
public class A032094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032094() {
    super(9, new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {4, 16, 60, 160, 396, 848, 1716, 3200, 5720, 9696, 15912, 25152});
  }
}
