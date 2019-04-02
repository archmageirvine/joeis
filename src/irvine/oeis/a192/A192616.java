package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192616 Constant term in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+x+1. See Comments.
 * @author Sean A. Irvine
 */
public class A192616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192616() {
    super(new long[] {1, 1, -4, -1, 4, 1}, new long[] {1, 0, 1, 1, 2, 6});
  }
}
