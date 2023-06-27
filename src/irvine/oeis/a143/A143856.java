package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143856 Ulam's spiral (ENE spoke).
 * @author Sean A. Irvine
 */
public class A143856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143856() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 12, 55});
  }
}
