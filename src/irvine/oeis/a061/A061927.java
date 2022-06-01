package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061927 a(n) = n(n+1)(2n+1)(n^2+n+3)/30.
 * @author Sean A. Irvine
 */
public class A061927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061927() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 9, 42, 138, 363});
  }
}
