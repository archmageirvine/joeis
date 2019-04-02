package irvine.oeis.a298;

import irvine.oeis.LinearRecurrence;

/**
 * A298101 Expansion of x*(1 + x)/((1 - x)*(1 - 322*x + x^2)).
 * @author Sean A. Irvine
 */
public class A298101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298101() {
    super(new long[] {1, -323, 323}, new long[] {0, 1, 324});
  }
}
