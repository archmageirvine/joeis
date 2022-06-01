package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166598 a(n) = 5*n - a(n-1), with n&gt;1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A166598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166598() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 10});
  }
}
