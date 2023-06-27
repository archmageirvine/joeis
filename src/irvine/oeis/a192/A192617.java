package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192617 Coefficient of x in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+x+1.
 * @author Sean A. Irvine
 */
public class A192617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192617() {
    super(1, new long[] {1, 1, -4, -1, 4, 1}, new long[] {0, 1, 0, 3, 2, 10});
  }
}
