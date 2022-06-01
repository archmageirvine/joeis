package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097063 Expansion of (1-2*x+3*x^2)/((1+x)*(1-x)^3).
 * @author Sean A. Irvine
 */
public class A097063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097063() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 0, 3, 4});
  }
}
