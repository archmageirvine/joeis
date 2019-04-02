package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167601 G.f.: 1/(1-3*x-40*x^2-192*x^3).
 * @author Sean A. Irvine
 */
public class A167601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167601() {
    super(new long[] {192, 40, 3}, new long[] {1, 3, 49});
  }
}
