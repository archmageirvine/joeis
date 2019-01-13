package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164470.
 * @author Sean A. Irvine
 */
public class A164470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164470() {
    super(new long[] {1, 0, -3, 2, -1, 2}, new long[] {13, 20, 32, 48, 69, 102});
  }
}
