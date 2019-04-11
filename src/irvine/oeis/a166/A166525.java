package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166525 <code>a(n) = 10*n - a(n-1),</code> with <code>n&gt;1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A166525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166525() {
    super(new long[] {-1, 1, 1}, new long[] {1, 19, 11});
  }
}
