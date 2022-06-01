package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113497 Ascending descending base exponent transform of sequence A000034(n) = 1 + n mod 2.
 * @author Sean A. Irvine
 */
public class A113497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113497() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 3, 6, 6});
  }
}
