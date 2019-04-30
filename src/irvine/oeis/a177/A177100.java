package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177100 Partial sums of <code>round(n^2/9)</code>.
 * @author Sean A. Irvine
 */
public class A177100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177100() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 3, 6, 10, 15, 22, 31, 42, 55});
  }
}
