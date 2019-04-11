package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166917 <code>a(n) = 20*a(n-1) - 64*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 85, a(1) = 1364</code>.
 * @author Sean A. Irvine
 */
public class A166917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166917() {
    super(new long[] {-64, 20}, new long[] {85, 1364});
  }
}
