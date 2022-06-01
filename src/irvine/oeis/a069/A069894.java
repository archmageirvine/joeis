package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069894 Centered square numbers: a(n) = 4*n^2 + 4*n + 2.
 * @author Sean A. Irvine
 */
public class A069894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069894() {
    super(new long[] {1, -3, 3}, new long[] {2, 10, 26});
  }
}
