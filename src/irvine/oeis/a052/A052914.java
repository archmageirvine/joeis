package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052914 Expansion of (1-x)/(1 - x - x^3 - 2*x^4 + 2*x^5).
 * @author Sean A. Irvine
 */
public class A052914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052914() {
    super(new long[] {-2, 2, 1, 0, 1}, new long[] {1, 0, 0, 1, 3});
  }
}
