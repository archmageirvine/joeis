package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100184 Structured octagonal anti-prism numbers.
 * @author Sean A. Irvine
 */
public class A100184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100184() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 64, 164});
  }
}
