package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211013 Second 13-gonal numbers: a(n) = n*(11*n+9)/2.
 * @author Sean A. Irvine
 */
public class A211013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211013() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 31});
  }
}
