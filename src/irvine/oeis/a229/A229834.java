package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229834 Expansion of (1+4*x+x^2) / ((1-x)^3*(1+x)^4).
 * @author Sean A. Irvine
 */
public class A229834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229834() {
    super(new long[] {1, 1, -3, -3, 3, 3, -1}, new long[] {1, 3, 1, 11, -2, 26, -10});
  }
}
