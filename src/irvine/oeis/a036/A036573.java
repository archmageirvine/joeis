package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036573.
 * @author Sean A. Irvine
 */
public class A036573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036573() {
    super(new long[] {1, -2, 0, 2}, new long[] {4, 8, 12, 17});
  }
}
