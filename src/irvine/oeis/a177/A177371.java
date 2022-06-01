package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177371 Expansion of (1+12*x-24*x^2+8*x^4)/((1-8*x+4*x^2+4*x^3)*(1+2*x-2*x^2)).
 * @author Sean A. Irvine
 */
public class A177371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177371() {
    super(new long[] {8, 0, -28, 14, 6}, new long[] {1, 18, 98, 812, 5748});
  }
}
