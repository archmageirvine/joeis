package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166117 <code>a(0)=0, a(1)=1, a(2)=2</code> and <code>a(n) = a(n-1) - 2a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A166117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166117() {
    super(new long[] {1, -2, 1}, new long[] {0, 1, 2});
  }
}
