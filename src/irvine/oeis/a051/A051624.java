package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051624 12-gonal (or dodecagonal) numbers: a(n) = n*(5*n-4).
 * @author Sean A. Irvine
 */
public class A051624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051624() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 12});
  }
}
