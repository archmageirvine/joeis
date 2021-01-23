package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022143 Fibonacci sequence beginning 5, 19.
 * @author Sean A. Irvine
 */
public class A022143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022143() {
    super(new long[] {1, 1}, new long[] {5, 19});
  }
}
