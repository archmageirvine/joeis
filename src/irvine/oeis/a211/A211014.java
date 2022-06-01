package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211014 Second 14-gonal numbers: n*(6*n+5).
 * @author Sean A. Irvine
 */
public class A211014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211014() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 34});
  }
}
