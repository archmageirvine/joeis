package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113684 Expansion of x(1-x^2-x^3)/((1-x)(1-x-x^2))^2.
 * @author Sean A. Irvine
 */
public class A113684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113684() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {0, 1, 4, 11, 25, 52});
  }
}
