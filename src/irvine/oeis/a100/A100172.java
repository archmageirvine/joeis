package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100172 Structured triakis icosahedral numbers (vertex structure 4).
 * @author Sean A. Irvine
 */
public class A100172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100172() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 32, 150, 412});
  }
}
