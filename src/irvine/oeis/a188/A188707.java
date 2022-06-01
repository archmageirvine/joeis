package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188707 Number of 3 X n binary arrays without the pattern 0 0 diagonally or vertically.
 * @author Sean A. Irvine
 */
public class A188707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188707() {
    super(new long[] {-3, 5}, new long[] {5, 21});
  }
}
