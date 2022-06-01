package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077940 Expansion of 1/(1-2*x+2*x^3).
 * @author Sean A. Irvine
 */
public class A077940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077940() {
    super(new long[] {-2, 0, 2}, new long[] {1, 2, 4});
  }
}
