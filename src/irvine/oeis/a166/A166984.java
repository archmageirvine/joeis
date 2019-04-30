package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166984 <code>a(n) = 20*a(n-1) - 64*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 20</code>.
 * @author Sean A. Irvine
 */
public class A166984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166984() {
    super(new long[] {-64, 20}, new long[] {1, 20});
  }
}
