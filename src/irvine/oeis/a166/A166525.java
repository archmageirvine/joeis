package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166525 a(n) = 10*n - a(n-1), with n&gt;1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A166525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166525() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 19, 11});
  }
}
