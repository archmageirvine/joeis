package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139784.
 * @author Sean A. Irvine
 */
public class A139784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139784() {
    super(new long[] {8, -4, 0, 0, -10, 5, 0, 0, 2}, new long[] {0, 0, 0, 0, 1, 2, 4, 8, 19});
  }
}
