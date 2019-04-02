package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072684 Expansion of (2+x+3*x^2+2*x^3+x^4)/(1-x-5*x^2+x^3+3*x^4-x^5).
 * @author Sean A. Irvine
 */
public class A072684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072684() {
    super(new long[] {1, -3, -1, 5, 1}, new long[] {2, 3, 16, 31, 103});
  }
}
