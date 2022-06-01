package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192800 Coefficient of x^2 in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+2.
 * @author Sean A. Irvine
 */
public class A192800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192800() {
    super(new long[] {1, 1, -3, 0, 3, 1}, new long[] {0, 0, 1, 1, 4, 7});
  }
}
