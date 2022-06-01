package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166524 a(n) = 9*n - a(n-1), with n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A166524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166524() {
    super(new long[] {-1, 1, 1}, new long[] {1, 17, 10});
  }
}
