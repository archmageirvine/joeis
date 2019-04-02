package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158784 Expansion of (1+4*x+14*x^2)/(1-2*x^2-64*x^3).
 * @author Sean A. Irvine
 */
public class A158784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158784() {
    super(new long[] {64, 2, 0}, new long[] {1, 4, 16});
  }
}
