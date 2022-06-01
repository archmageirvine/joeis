package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258841 a(n) = 9*n^2 - 237*n + 1927.
 * @author Sean A. Irvine
 */
public class A258841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258841() {
    super(new long[] {1, -3, 3}, new long[] {1927, 1699, 1489});
  }
}
