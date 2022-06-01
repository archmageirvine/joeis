package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023424 Expansion of (1+2*x+3*x^2+4*x^3+5*x^4)/(1-x-x^2-x^3-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A023424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023424() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, 3, 7, 15, 31});
  }
}
