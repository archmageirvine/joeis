package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060354 The n-th n-gonal number: <code>a(n) = n*(n^2-3*n+4)/2</code>.
 * @author Sean A. Irvine
 */
public class A060354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060354() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 2, 6});
  }
}
