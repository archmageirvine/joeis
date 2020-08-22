package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122604 Expansion of  x*(x^3+3*x^2-1)*(5*x^4-5*x^2+1) / ( -1+x+8*x^2-7*x^3-21*x^4+15*x^5+20*x^6-10*x^7-5*x^8+x^9 ).
 * @author Sean A. Irvine
 */
public class A122604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122604() {
    super(new long[] {1, -5, -10, 20, 15, -21, -7, 8, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
