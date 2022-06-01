package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256857 a(n) = n*(n^2 + 3*n - 2)/2.
 * @author Sean A. Irvine
 */
public class A256857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256857() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 8, 24});
  }
}
