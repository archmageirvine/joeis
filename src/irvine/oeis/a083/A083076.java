package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083076 Third row of number array A083075.
 * @author Sean A. Irvine
 */
public class A083076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083076() {
    super(new long[] {-7, 8}, new long[] {1, 5});
  }
}
