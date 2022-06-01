package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166012 a(n) = 2*(A000045(n)-(n mod 2)) + 1 + (n mod 2).
 * @author Sean A. Irvine
 */
public class A166012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166012() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 2, 3, 4});
  }
}
