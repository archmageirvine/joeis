package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143839 Ulam's spiral (SSE spoke).
 * @author Sean A. Irvine
 */
public class A143839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143839() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 79});
  }
}
