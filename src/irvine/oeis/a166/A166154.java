package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166154 <code>7*n*(n+1)/2 - 5</code>.
 * @author Sean A. Irvine
 */
public class A166154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166154() {
    super(new long[] {1, -3, 3}, new long[] {2, 16, 37});
  }
}
