package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192799 Coefficient of x in the reduction of the n-th Fibonacci polynomial by x^3-&gt;x^2+2.
 * @author Sean A. Irvine
 */
public class A192799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192799() {
    super(new long[] {1, 1, -3, 0, 3, 1}, new long[] {0, 1, 0, 2, 2, 5});
  }
}
