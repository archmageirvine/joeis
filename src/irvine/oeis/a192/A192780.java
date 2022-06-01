package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192780 Constant term in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+1. See Comments.
 * @author Sean A. Irvine
 */
public class A192780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192780() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {1, 0, 1, 1, 2, 5});
  }
}
