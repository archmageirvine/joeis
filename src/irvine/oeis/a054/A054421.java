package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054421 Number of disconnected 3 X n binary matrices.
 * @author Sean A. Irvine
 */
public class A054421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054421() {
    super(new long[] {-35, 26, -52, 14}, new long[] {0, 1, 11, 102});
  }
}
