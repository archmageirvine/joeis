package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166148 <code>a(n) = (9*n^2 + 9*n - 16)/2</code>.
 * @author Sean A. Irvine
 */
public class A166148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166148() {
    super(new long[] {1, -3, 3}, new long[] {1, 19, 46});
  }
}
