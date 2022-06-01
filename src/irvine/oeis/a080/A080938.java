package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080938 Number of Catalan paths (nonnegative, starting and ending at 0, step +-1) of 2*n steps with all values less than or equal to 7.
 * @author Sean A. Irvine
 */
public class A080938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080938() {
    super(new long[] {-1, 10, -15, 7}, new long[] {1, 1, 2, 5});
  }
}
