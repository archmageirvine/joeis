package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143854 Ulam's spiral (WSW spoke).
 * @author Sean A. Irvine
 */
public class A143854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143854() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 20, 71});
  }
}
