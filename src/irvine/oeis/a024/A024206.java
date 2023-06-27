package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024206 Expansion of x^2*(1+x-x^2)/((1-x^2)*(1-x)^2).
 * @author Sean A. Irvine
 */
public class A024206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024206() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {0, 1, 3, 5});
  }
}
