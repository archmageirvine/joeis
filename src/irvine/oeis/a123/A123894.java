package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123894 G.f.: -(1+x^2)*(1+2*x^2)*(1+3*x^2)*(1+4*x^2)/(-1-10*x^2-35*x^4-50*x^6-24*x^8+5*x+40*x^3+105*x^5+100*x^7+24*x^9).
 * @author Sean A. Irvine
 */
public class A123894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123894() {
    super(new long[] {24, -24, 100, -50, 105, -35, 40, -10, 5}, new long[] {1, 5, 25, 115, 525, 2405, 11025, 50525, 231525});
  }
}
