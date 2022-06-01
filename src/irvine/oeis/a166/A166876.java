package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166876 a(n) = a(n-1) + Fibonacci(n), a(1)=1983.
 * @author Sean A. Irvine
 */
public class A166876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166876() {
    super(new long[] {-1, 0, 2}, new long[] {1983, 1984, 1986});
  }
}
