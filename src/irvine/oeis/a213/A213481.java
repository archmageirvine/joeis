package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213481.
 * @author Sean A. Irvine
 */
public class A213481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213481() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 7, 25, 59, 117, 202});
  }
}
