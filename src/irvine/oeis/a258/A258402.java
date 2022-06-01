package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258402 a(n) = (n^2 + 4*n + 6) * n^2.
 * @author Sean A. Irvine
 */
public class A258402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258402() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 11, 72, 243, 608});
  }
}
