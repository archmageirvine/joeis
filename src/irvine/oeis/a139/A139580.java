package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139580 a(n) = n*(2*n + 17).
 * @author Sean A. Irvine
 */
public class A139580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139580() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 42});
  }
}
