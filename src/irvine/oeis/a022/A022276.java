package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022276 a(n) = n*(19*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022276() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 37});
  }
}
