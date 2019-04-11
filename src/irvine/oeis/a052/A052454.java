package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052454 Positive integer values of n such that <code>10n^2 - 9</code> is a square.
 * @author Sean A. Irvine
 */
public class A052454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052454() {
    super(new long[] {-1, 0, 0, 38, 0, 0}, new long[] {1, 3, 13, 25, 111, 493});
  }
}
