package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100261 Continued fraction expansion of <code>cot(1-Pi/4)</code>.
 * @author Sean A. Irvine
 */
public class A100261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100261() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {4, 1, 1, 2, 2, 1, 16, 1, 4, 2, 5, 1});
  }
}
