package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036486.
 * @author Sean A. Irvine
 */
public class A036486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036486() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 4, 14, 32});
  }
}
