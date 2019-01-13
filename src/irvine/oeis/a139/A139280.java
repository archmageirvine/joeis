package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139280.
 * @author Sean A. Irvine
 */
public class A139280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139280() {
    super(new long[] {-1, 2}, new long[] {9, 99});
  }
}
