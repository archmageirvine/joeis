package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024876 Expansion of <code>(3-2*x-3*x^2-4*x^3)/(1-3*x+x^2+x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A024876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024876() {
    super(new long[] {-1, -1, -1, 3}, new long[] {3, 7, 15, 31});
  }
}
