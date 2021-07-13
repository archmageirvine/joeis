package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123020 Expansion of (1 -5*x +5*x^2)/((1 -2*x)*(1 -4*x +x^2)).
 * @author Sean A. Irvine
 */
public class A123020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123020() {
    super(new long[] {2, -9, 6}, new long[] {1, 1, 2});
  }
}
