package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192772 Constant term in the reduction of the n-th Fibonacci polynomial by <code>x^3-&gt;x^2+2x+1</code>.
 * @author Sean A. Irvine
 */
public class A192772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192772() {
    super(new long[] {1, 1, -5, -1, 5, 1}, new long[] {1, 0, 1, 1, 2, 7});
  }
}
