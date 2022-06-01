package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166542 a(n) = 6*n - a(n-1), with n&gt;1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A166542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166542() {
    super(new long[] {-1, 1, 1}, new long[] {2, 10, 8});
  }
}
