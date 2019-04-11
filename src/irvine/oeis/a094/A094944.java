package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094944 A sequence with <code>a(n)/a(n-1)</code> converging to 7, generated from a semi-magic square.
 * @author Sean A. Irvine
 */
public class A094944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094944() {
    super(new long[] {49, 21, 3}, new long[] {1, 17, 121});
  }
}
