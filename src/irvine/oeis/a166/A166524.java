package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166524 <code>a(n) = 9*n - a(n-1)</code>, with <code>n&gt;1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A166524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166524() {
    super(new long[] {-1, 1, 1}, new long[] {1, 17, 10});
  }
}
