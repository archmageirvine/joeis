package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267691 a(n) = (n + 1)*(6*n^4 - 21*n^3 + 31*n^2 - 31*n + 30)/30.
 * @author Sean A. Irvine
 */
public class A267691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267691() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 1, 2, 18, 99, 355});
  }
}
