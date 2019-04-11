package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166450 <code>a(n) = 3*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 1, a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A166450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166450() {
    super(new long[] {3, 0}, new long[] {1, 6});
  }
}
