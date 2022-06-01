package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166465 a(n) = 3*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A166465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166465() {
    super(new long[] {3, 0}, new long[] {1, 5});
  }
}
