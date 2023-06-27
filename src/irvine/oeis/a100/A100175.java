package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100175 Structured triakis tetrahedral numbers (vertex structure 4).
 * @author Sean A. Irvine
 */
public class A100175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100175() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 8, 30, 76});
  }
}
