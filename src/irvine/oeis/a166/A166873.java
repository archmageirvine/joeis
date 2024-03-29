package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166873 a(n) = a(n-1) + 12*n for n &gt; 1; a(1) = 1.
 * @author Sean A. Irvine
 */
public class A166873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166873() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 25, 61});
  }
}
