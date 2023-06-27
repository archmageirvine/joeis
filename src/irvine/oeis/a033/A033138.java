package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033138 a(n) = floor(2^(n+2)/7).
 * @author Sean A. Irvine
 */
public class A033138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033138() {
    super(1, new long[] {-2, 1, 0, 2}, new long[] {1, 2, 4, 9});
  }
}
