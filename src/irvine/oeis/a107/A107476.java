package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107476 Expansion of <code>-x*(-1+5*x+8*x^2-11*x^3+3*x^4)/(1-6*x-4*x^2+24*x^3-6*x^4-4*x^5+x^6) </code>.
 * @author Sean A. Irvine
 */
public class A107476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107476() {
    super(new long[] {-1, 4, 6, -24, 4, 6}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
