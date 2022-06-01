package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166526 a(n) = 12*n - a(n-1), with n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A166526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166526() {
    super(new long[] {-1, 1, 1}, new long[] {1, 23, 13});
  }
}
