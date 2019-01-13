package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181475.
 * @author Sean A. Irvine
 */
public class A181475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181475() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 91, 397, 1141});
  }
}
