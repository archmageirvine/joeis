package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094944 A sequence with a(n)/a(n-1) converging to 7, generated from a semi-magic square.
 * @author Sean A. Irvine
 */
public class A094944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094944() {
    super(1, new long[] {49, 21, 3}, new long[] {1, 17, 121});
  }
}
