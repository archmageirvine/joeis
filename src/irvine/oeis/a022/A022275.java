package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022275 a(n) = n*(17*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022275() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 35});
  }
}
