package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100187 Structured octagonal anti-diamond numbers (vertex structure 7).
 * @author Sean A. Irvine
 */
public class A100187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100187() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 18, 77, 204});
  }
}
