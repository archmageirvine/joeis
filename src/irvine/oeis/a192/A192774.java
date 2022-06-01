package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192774 Coefficient of x^2 in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+2x+1.
 * @author Sean A. Irvine
 */
public class A192774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192774() {
    super(new long[] {1, 1, -5, -1, 5, 1}, new long[] {0, 0, 1, 1, 6, 10});
  }
}
