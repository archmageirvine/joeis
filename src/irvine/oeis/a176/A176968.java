package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176968 Expansion of x*( 1+2*x-x^2-6*x^3 ) / ( 1-9*x^2+12*x^4 ).
 * @author Sean A. Irvine
 */
public class A176968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176968() {
    super(new long[] {-12, 0, 9, 0}, new long[] {1, 2, 8, 12});
  }
}
