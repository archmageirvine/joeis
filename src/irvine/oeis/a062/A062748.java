package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062748 Fourth column (r=3) of FS(3) staircase array A062745.
 * @author Sean A. Irvine
 */
public class A062748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062748() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 9, 19, 34});
  }
}
