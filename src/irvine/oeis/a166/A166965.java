package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166965 a(n) = 20*a(n-1) - 64*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 19.
 * @author Sean A. Irvine
 */
public class A166965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166965() {
    super(new long[] {-64, 20}, new long[] {1, 19});
  }
}
