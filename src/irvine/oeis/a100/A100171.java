package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100171 Structured triakis octahedral numbers (vertex structure 4).
 * @author Sean A. Irvine
 */
public class A100171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100171() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 60, 160});
  }
}
