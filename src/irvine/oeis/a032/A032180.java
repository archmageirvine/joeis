package irvine.oeis.a032;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A032180 Number of ways to partition n labeled elements into 6 pie slices.
 * @author Sean A. Irvine
 */
public class A032180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032180() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {120, 2520, 31920, 317520, 2739240, 21538440});
  }
}
