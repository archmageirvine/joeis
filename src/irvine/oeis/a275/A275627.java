package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275627 Expansion of (6*x^5+5*x^4+4*x^3+3*x^2+2*x+8)/(1-x-x^6).
 * @author Sean A. Irvine
 */
public class A275627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275627() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {8, 10, 13, 17, 22, 28});
  }
}
