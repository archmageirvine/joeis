package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125202 a(n) = 4*n^2 - 6*n + 1.
 * @author Sean A. Irvine
 */
public class A125202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125202() {
    super(new long[] {1, -3, 3}, new long[] {-1, 5, 19});
  }
}
