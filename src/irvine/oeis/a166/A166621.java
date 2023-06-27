package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166621 a(n) = 10*n - a(n-1), with n&gt;1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A166621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166621() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 15, 15});
  }
}
