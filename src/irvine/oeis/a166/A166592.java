package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166592 Hankel transform of A166588(n-1).
 * @author Sean A. Irvine
 */
public class A166592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166592() {
    super(new long[] {-1, 0, 1, 0}, new long[] {0, 1, 3, 2});
  }
}
