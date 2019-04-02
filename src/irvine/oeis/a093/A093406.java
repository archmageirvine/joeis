package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093406 A sequence converging to 1 + 2^(1/4).
 * @author Sean A. Irvine
 */
public class A093406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093406() {
    super(new long[] {1, 4, -6, 4}, new long[] {1, 3, 11, 31});
  }
}
