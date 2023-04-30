package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200441 Expansion of g.f. 1/(1 - 33*x + x^2).
 * @author Sean A. Irvine
 */
public class A200441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200441() {
    super(new long[] {-1, 33}, new long[] {1, 33});
  }
}
