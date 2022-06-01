package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107377 Expansion of x*(1-4*x-3*x^2)/(1-5*x+5*x^3+x^4).
 * @author Sean A. Irvine
 */
public class A107377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107377() {
    super(new long[] {-1, -5, 0, 5}, new long[] {0, 1, 1, 2});
  }
}
