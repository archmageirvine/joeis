package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259159.
 * @author Sean A. Irvine
 */
public class A259159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259159() {
    super(new long[] {1, -103683, 103683}, new long[] {9, 938961, 97353360225L});
  }
}
