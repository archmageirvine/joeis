package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166578 <code>a(n) = a(n-3) + 2^(n-4)</code> with <code>a(1) = 1, a(2) = 2, a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A166578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166578() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 1, 2});
  }
}
