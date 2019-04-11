package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019478 <code>a(n) = 5*a(n-1) + a(n-2) - 3*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A019478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019478() {
    super(new long[] {-3, 1, 5}, new long[] {3, 15, 76});
  }
}
