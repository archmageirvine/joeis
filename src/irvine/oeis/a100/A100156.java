package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100156 Structured truncated tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A100156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100156() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 12, 44, 108});
  }
}
