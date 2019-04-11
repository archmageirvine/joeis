package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100157 Structured rhombic dodecahedral numbers (vertex structure 9).
 * @author Sean A. Irvine
 */
public class A100157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100157() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 55, 140});
  }
}
