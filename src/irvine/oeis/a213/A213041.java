package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213041.
 * @author Sean A. Irvine
 */
public class A213041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213041() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 7, 12});
  }
}
