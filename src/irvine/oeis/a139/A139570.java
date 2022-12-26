package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139570 a(n) = 2*n*(n+3).
 * @author Sean A. Irvine
 */
public class A139570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139570() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 20});
  }
}
