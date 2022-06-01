package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052947 Expansion of 1/(1-x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A052947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052947() {
    super(new long[] {2, 1, 0}, new long[] {1, 0, 1});
  }
}
