package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166920 <code>a(n) = 2^n - (1 + (-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A166920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166920() {
    super(new long[] {-2, 1, 2}, new long[] {0, 2, 3});
  }
}
