package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290923 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> 2*S - 2*S^2.
 * @author Sean A. Irvine
 */
public class A290923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290923() {
    super(new long[] {-1, 6, -8, 6}, new long[] {2, 10, 46, 208});
  }
}
