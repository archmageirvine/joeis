package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090399 Expansion of 1/(1-2x+2x^4).
 * @author Sean A. Irvine
 */
public class A090399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090399() {
    super(new long[] {-2, 0, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
