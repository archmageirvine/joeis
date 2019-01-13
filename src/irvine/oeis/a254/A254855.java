package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254855.
 * @author Sean A. Irvine
 */
public class A254855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254855() {
    super(new long[] {1, -1, -26, 26, 1}, new long[] {1, 2, 16, 43, 407});
  }
}
