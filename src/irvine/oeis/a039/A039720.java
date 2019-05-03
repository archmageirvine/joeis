package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039720 Period of <code>n-countdown club-passing</code> juggling pattern.
 * @author Sean A. Irvine
 */
public class A039720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039720() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {6, 8, 30, 24, 70, 48});
  }
}
