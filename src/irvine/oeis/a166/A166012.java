package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166012 <code>a(n) =</code> 2*(A000045(n)-(n <code>mod 2)) + 1 + (n mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A166012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166012() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 2, 3, 4});
  }
}
