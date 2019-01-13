package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163614.
 * @author Sean A. Irvine
 */
public class A163614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163614() {
    super(new long[] {-7, 6}, new long[] {1, 9});
  }
}
