package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121671 Real part of (1 + n*i)^5.
 * @author Sean A. Irvine
 */
public class A121671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121671() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, -4, 41, 316, 1121});
  }
}
