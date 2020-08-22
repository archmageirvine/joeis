package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135990 Expansion of x^3*(x-1)*(x+1) / (x^5-2*x^4+x^2-1).
 * @author Sean A. Irvine
 */
public class A135990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135990() {
    super(new long[] {1, -2, 0, 1, 0}, new long[] {0, 0, 1, 0, 0});
  }
}
