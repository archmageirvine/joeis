package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259348 a(n) = n^3 - 8.
 * @author Sean A. Irvine
 */
public class A259348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259348() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-8, -7, 0, 19});
  }
}
