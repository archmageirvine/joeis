package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192387 Coefficient of x in the reduction by <code>x^2-&gt;x+1</code> of the polynomial <code>p(n,x)</code> defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192387() {
    super(new long[] {-16, -8, 12, 2}, new long[] {0, 2, 4, 32});
  }
}
