package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166754 a(n) = 4*A061547(n+1) - 3*A166753(n).
 * @author Sean A. Irvine
 */
public class A166754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166754() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 2, 9, 22});
  }
}
