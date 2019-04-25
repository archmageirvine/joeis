package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062781 Number of arithmetic progressions of four terms and <code>any</code> mean which can be extracted from the set of the first n positive integers.
 * @author Sean A. Irvine
 */
public class A062781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062781() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 0, 1, 2});
  }
}
