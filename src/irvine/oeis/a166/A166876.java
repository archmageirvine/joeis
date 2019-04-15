package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166876 <code>a(n) = a(n-1) + Fibonacci(n), a(1)=1983</code>.
 * @author Sean A. Irvine
 */
public class A166876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166876() {
    super(new long[] {-1, 0, 2}, new long[] {1983, 1984, 1986});
  }
}
