package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173275 a(n) = 169*n^2 + n.
 * @author Sean A. Irvine
 */
public class A173275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173275() {
    super(new long[] {1, -3, 3}, new long[] {170, 678, 1524});
  }
}
