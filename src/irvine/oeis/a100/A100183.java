package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100183 Structured hexagonal anti-prism numbers.
 * @author Sean A. Irvine
 */
public class A100183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100183() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 12, 46, 116});
  }
}
