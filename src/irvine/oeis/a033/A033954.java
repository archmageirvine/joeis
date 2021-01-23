package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033954 Second 10-gonal (or decagonal) numbers: n*(4*n+3).
 * @author Sean A. Irvine
 */
public class A033954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033954() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 22});
  }
}
