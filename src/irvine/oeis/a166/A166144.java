package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166144 a(n) = (11*n^2 + 11*n - 20)/2.
 * @author Sean A. Irvine
 */
public class A166144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166144() {
    super(new long[] {1, -3, 3}, new long[] {1, 23, 56});
  }
}
