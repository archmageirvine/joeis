package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247035 Expansion of 2*(x+1)*(x^4+6*x^3+5*x^2+6*x+1)/(x^6-18*x^3+1).
 * @author Sean A. Irvine
 */
public class A247035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247035() {
    super(new long[] {-1, 0, 0, 18, 0, 0}, new long[] {2, 14, 22, 58, 266, 398});
  }
}
