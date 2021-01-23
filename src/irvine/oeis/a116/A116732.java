package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116732 a(n) = a(n-1) + a(n-2) + a(n-3) - a(n-4).
 * @author Sean A. Irvine
 */
public class A116732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116732() {
    super(new long[] {-1, 1, 1, 1}, new long[] {0, 0, 0, 1});
  }
}
