package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120925 Number of ternary words on {0,1,2} having no isolated 0's.
 * @author Sean A. Irvine
 */
public class A120925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120925() {
    super(new long[] {2, -2, 3}, new long[] {1, 2, 5});
  }
}
