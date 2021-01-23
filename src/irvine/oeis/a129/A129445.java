package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129445 Numbers k &gt; 0 such that k^2 is a centered triangular number.
 * @author Sean A. Irvine
 */
public class A129445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129445() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 2, 8, 19});
  }
}
