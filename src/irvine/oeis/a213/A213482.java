package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213482.
 * @author Sean A. Irvine
 */
public class A213482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213482() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 3, 14, 41, 87, 161});
  }
}
