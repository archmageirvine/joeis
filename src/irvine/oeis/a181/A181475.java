package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181475 <code>a(n) = 3*n^4 + 6*n^3 - 3*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A181475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181475() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 91, 397, 1141});
  }
}
