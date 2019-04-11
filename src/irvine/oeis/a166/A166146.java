package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166146 <code>a(n) = (7*n^2 + 7*n - 12)/2</code>.
 * @author Sean A. Irvine
 */
public class A166146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166146() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 36});
  }
}
