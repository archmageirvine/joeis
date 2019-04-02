package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058645 a(n) = 2^(n-3)*n^2*(n+3).
 * @author Sean A. Irvine
 */
public class A058645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058645() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 1, 10, 54});
  }
}
