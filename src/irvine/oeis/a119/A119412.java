package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119412 a(n) = n*(n+11).
 * @author Sean A. Irvine
 */
public class A119412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119412() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 26});
  }
}
