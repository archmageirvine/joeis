package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199403 Binary XOR of (2^k - (-1)^k)/3 as k varies from 1 to n.
 * @author Sean A. Irvine
 */
public class A199403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199403() {
    super(1, new long[] {-2, 1, 0, 0, 2}, new long[] {1, 0, 3, 6, 13});
  }
}
