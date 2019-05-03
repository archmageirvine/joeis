package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084155 A <code>Pell-related fourth-order</code> recurrence.
 * @author Sean A. Irvine
 */
public class A084155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084155() {
    super(new long[] {7, 8, -18, 8}, new long[] {0, 1, 4, 19});
  }
}
