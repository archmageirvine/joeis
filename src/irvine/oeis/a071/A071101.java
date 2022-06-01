package irvine.oeis.a071;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A071101 Expansion of (5 + 6*x + 3*x^2 - 2*x^3) / (1 - 2*x - 2*x^2 - 2*x^3 + x^4) in powers of x.
 * @author Sean A. Irvine
 */
public class A071101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071101() {
    super(new long[] {-1, 2, 2, 2}, new long[] {5, 16, 45, 130});
  }
}
