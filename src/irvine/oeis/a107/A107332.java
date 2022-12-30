package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107332 Expansion of x^2*(-1+x+x^2)/(-1+x+x^2-x^3+x^5).
 * @author Sean A. Irvine
 */
public class A107332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107332() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 1, 0, 0, -1});
  }
}
