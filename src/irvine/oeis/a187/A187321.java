package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187321 a(n) = floor(n/2) + floor(n/4).
 * @author Sean A. Irvine
 */
public class A187321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187321() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 1, 1, 3});
  }
}
