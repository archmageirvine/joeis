package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166914 a(n) = 20*a(n-1) - 64*a(n-2) for n &gt; 1; a(0) = 21, a(1) = 340.
 * @author Sean A. Irvine
 */
public class A166914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166914() {
    super(new long[] {-64, 20}, new long[] {21, 340});
  }
}
