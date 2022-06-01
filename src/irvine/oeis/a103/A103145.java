package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103145 a(n) = (1/6)*(n^3 + 21*n^2 + 74*n + 18).
 * @author Sean A. Irvine
 */
public class A103145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103145() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 19, 43, 76});
  }
}
