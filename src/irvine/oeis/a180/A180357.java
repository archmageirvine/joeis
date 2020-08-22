package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180357 a(n) = n^7 + 7*n.
 * @author Sean A. Irvine
 */
public class A180357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180357() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 8, 142, 2208, 16412, 78160, 279978, 823592});
  }
}
