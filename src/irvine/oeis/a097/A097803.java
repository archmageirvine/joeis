package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097803 a(n) = 3*(2*n^2 + 1).
 * @author Sean A. Irvine
 */
public class A097803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097803() {
    super(new long[] {1, -3, 3}, new long[] {3, 9, 27});
  }
}
