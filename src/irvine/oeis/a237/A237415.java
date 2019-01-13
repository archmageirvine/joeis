package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237415.
 * @author Sean A. Irvine
 */
public class A237415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237415() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 8, 9, 10});
  }
}
