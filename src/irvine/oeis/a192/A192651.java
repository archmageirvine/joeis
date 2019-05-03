package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192651 Coefficient of <code>x^2</code> in the reduction of the n-th Fibonacci polynomial by <code>x^3-&gt;x^2+x+1</code>. See Comments.
 * @author Sean A. Irvine
 */
public class A192651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192651() {
    super(new long[] {1, 1, -4, -1, 4, 1}, new long[] {0, 0, 1, 1, 5, 8});
  }
}
