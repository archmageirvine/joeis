package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188480 a(n) = (n^4 + 16*n^3 + 65*n^2 + 26*n + 12)/12.
 * @author Sean A. Irvine
 */
public class A188480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188480() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 39, 99, 203});
  }
}
