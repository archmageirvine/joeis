package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192801 Constant term in the reduction of the polynomial (x+2)^n by x^3-&gt;x^2+x+1. See Comments.
 * @author Sean A. Irvine
 */
public class A192801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192801() {
    super(new long[] {11, -15, 7}, new long[] {1, 2, 4});
  }
}
