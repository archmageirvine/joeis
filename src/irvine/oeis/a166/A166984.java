package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166984 a(n) = 20*a(n-1) - 64*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 20.
 * @author Sean A. Irvine
 */
public class A166984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166984() {
    super(new long[] {-64, 20}, new long[] {1, 20});
  }
}
