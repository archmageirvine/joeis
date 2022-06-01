package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211412 a(n) = 4*n^4 + 1.
 * @author Sean A. Irvine
 */
public class A211412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211412() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {5, 65, 325, 1025, 2501});
  }
}
