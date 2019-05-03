package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100175 Structured triakis tetrahedral numbers (vertex structure <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A100175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100175() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 30, 76});
  }
}
