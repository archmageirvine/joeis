package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111927 Expansion of x^3 / ((x-1)*(2*x-1)*(x^2-x+1)).
 * @author Sean A. Irvine
 */
public class A111927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111927() {
    super(new long[] {-2, 5, -6, 4}, new long[] {0, 0, 0, 1});
  }
}
