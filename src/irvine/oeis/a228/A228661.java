package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228661 Number of 2 X n binary arrays with top left value 1 and no two ones adjacent horizontally, diagonally or antidiagonally.
 * @author Sean A. Irvine
 */
public class A228661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228661() {
    super(1, new long[] {3, 1}, new long[] {2, 2});
  }
}
