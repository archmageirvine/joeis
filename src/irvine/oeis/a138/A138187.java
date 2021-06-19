package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138187 Hankel transform of binomial(2*n+3, n).
 * @author Sean A. Irvine
 */
public class A138187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138187() {
    super(new long[] {-1, -2, -3, -2}, new long[] {1, -4, 3, 3});
  }
}
