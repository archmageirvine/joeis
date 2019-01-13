package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163832.
 * @author Sean A. Irvine
 */
public class A163832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163832() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 38, 102});
  }
}
