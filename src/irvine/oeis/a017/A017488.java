package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017488 a(n) = (11*n + 8)^4.
 * @author Sean A. Irvine
 */
public class A017488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017488() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4096, 130321, 810000, 2825761, 7311616});
  }
}
