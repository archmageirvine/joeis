package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166621 <code>a(n) = 10*n - a(n-1)</code>, with <code>n&gt;1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A166621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166621() {
    super(new long[] {-1, 1, 1}, new long[] {5, 15, 15});
  }
}
