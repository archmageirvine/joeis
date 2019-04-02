package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264853 a(n) = n*(n + 1)*(5*n^2 + 5*n - 4)/12.
 * @author Sean A. Irvine
 */
public class A264853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264853() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 13, 56, 160});
  }
}
