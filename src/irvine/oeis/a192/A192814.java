package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192814 Constant term in the reduction of the polynomial (2*x+1)^n by x^3 -&gt; x^2 + x + 1. See Comments.
 * @author Sean A. Irvine
 */
public class A192814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192814() {
    super(new long[] {7, -3, 5}, new long[] {1, 1, 1});
  }
}
