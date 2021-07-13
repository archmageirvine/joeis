package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059973 Expansion of x*(1 + x - 2*x^2) / ( 1 - 4*x^2 - x^4).
 * @author Sean A. Irvine
 */
public class A059973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059973() {
    super(new long[] {1, 0, 4, 0}, new long[] {0, 1, 1, 2});
  }
}
