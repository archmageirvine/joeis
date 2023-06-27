package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166523 a(n) = 8*n - a(n-1), with n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A166523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166523() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 15, 9});
  }
}
