package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166598 <code>a(n) = 5*n - a(n-1)</code>, with <code>n&gt;1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A166598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166598() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 10});
  }
}
