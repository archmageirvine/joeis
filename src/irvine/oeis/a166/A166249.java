package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166249 <code>a(n) = 2*a(n-1) - a(n-3) + 2*a(n-4)</code> for <code>n&gt;3, a(0)=a(1)=1, a(2)=0, a(3)=2</code>.
 * @author Sean A. Irvine
 */
public class A166249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166249() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 1, 0, 2});
  }
}
