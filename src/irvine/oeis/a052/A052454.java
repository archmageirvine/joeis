package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052454 Positive integer values of k such that 10*k^2 - 9 is a square.
 * @author Sean A. Irvine
 */
public class A052454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052454() {
    super(1, new long[] {-1, 0, 0, 38, 0, 0}, new long[] {1, 3, 13, 25, 111, 493});
  }
}
