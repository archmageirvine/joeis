package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192781 Coefficient of x in the reduction of the n-th Fibonacci polynomial by <code>x^3-&gt;x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A192781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192781() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {0, 1, 0, 2, 1, 4});
  }
}
