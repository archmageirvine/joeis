package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254283.
 * @author Sean A. Irvine
 */
public class A254283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254283() {
    super(new long[] {1, -1, -194, 194, 1}, new long[] {1, 31, 115, 5965, 22261});
  }
}
