package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192779 Coefficient of <code>x^2</code> in the reduction of the n-th Fibonacci polynomial by <code>x^3-&gt;x^2+3x+1</code>.
 * @author Sean A. Irvine
 */
public class A192779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192779() {
    super(new long[] {1, 1, -6, -1, 6, 1}, new long[] {0, 0, 1, 1, 7, 12});
  }
}
