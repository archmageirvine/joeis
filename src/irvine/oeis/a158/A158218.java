package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158218 a(n) = 169*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158218() {
    super(1, new long[] {1, -3, 3}, new long[] {167, 672, 1515});
  }
}
