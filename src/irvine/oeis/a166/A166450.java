package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166450 a(n) = 3*a(n-2) for n &gt; 2; a(1) = 1, a(2) = 6.
 * @author Sean A. Irvine
 */
public class A166450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166450() {
    super(new long[] {3, 0}, new long[] {1, 6});
  }
}
