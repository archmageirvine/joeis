package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166137 a(n) = 5*n*(n+1)/2 - 4.
 * @author Sean A. Irvine
 */
public class A166137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166137() {
    super(new long[] {1, -3, 3}, new long[] {1, 11, 26});
  }
}
