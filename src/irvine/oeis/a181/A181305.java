package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181305.
 * @author Sean A. Irvine
 */
public class A181305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181305() {
    super(new long[] {-4, 12, -4, -12, 7}, new long[] {0, 1, 5, 24, 104});
  }
}
