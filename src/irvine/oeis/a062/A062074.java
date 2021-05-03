package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062074 a(n) = n^3 * 3^n.
 * @author Sean A. Irvine
 */
public class A062074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062074() {
    super(new long[] {-81, 108, -54, 12}, new long[] {0, 3, 72, 729});
  }
}
