package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154560 (n+3)^2*n/2 + 1.
 * @author Sean A. Irvine
 */
public class A154560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154560() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 26, 55});
  }
}
