package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219389 Numbers k such that 13*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219389() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 11, 15, 48, 56});
  }
}
