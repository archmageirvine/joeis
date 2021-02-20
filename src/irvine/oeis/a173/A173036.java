package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173036 a(n) = binomial(n+1, 2) + 13.
 * @author Sean A. Irvine
 */
public class A173036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173036() {
    super(new long[] {1, -3, 3}, new long[] {13, 14, 16});
  }
}
