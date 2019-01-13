package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254877.
 * @author Sean A. Irvine
 */
public class A254877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254877() {
    super(new long[] {-1, 0, 2, 1, 0, -2, -2, 0, 1, 2, 0}, new long[] {1, 1, 3, 4, 8, 9, 16, 18, 28, 31, 45});
  }
}
