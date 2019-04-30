package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166481 <code>a(n) = 3*a(n-2)</code> for <code>n &gt; 2; a(1) = 1; a(2) = 7</code>.
 * @author Sean A. Irvine
 */
public class A166481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166481() {
    super(new long[] {3, 0}, new long[] {1, 7});
  }
}
