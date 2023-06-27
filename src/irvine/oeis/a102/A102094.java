package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102094 a(n) = (2*n-1)*(2*n+1)^2.
 * @author Sean A. Irvine
 */
public class A102094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102094() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {9, 75, 245, 567});
  }
}
