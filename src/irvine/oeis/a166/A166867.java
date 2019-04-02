package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166867 a(n) = Pell(n+3) - Jacobsthal(n+4).
 * @author Sean A. Irvine
 */
public class A166867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166867() {
    super(new long[] {-2, -5, 1, 3}, new long[] {0, 1, 8, 27});
  }
}
