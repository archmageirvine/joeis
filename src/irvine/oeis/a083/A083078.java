package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083078 6th row of number array A083075.
 * @author Sean A. Irvine
 */
public class A083078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083078() {
    super(new long[] {-13, 14}, new long[] {1, 11});
  }
}
