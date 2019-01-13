package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036605.
 * @author Sean A. Irvine
 */
public class A036605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036605() {
    super(new long[] {1, 2, 1, 0}, new long[] {1, 4, 4, 7});
  }
}
