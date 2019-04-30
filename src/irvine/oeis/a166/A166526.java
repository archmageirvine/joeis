package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166526 <code>a(n) = 12*n - a(n-1)</code>, with <code>n&gt;1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A166526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166526() {
    super(new long[] {-1, 1, 1}, new long[] {1, 23, 13});
  }
}
