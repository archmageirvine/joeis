package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100176 Structured octagonal prism numbers.
 * @author Sean A. Irvine
 */
public class A100176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100176() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 63, 160});
  }
}
