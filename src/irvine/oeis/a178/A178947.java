package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178947 Expansion of x*(1+2*x+8*x^2+3*x^4+4*x^3) / ( (1+x)^2*(x-1)^4 ).
 * @author Sean A. Irvine
 */
public class A178947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178947() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 17, 38, 81, 138});
  }
}
