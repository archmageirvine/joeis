package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192953 Coefficient of x in the reduction by <code>x^2 -&gt; x+1</code> of the polynomial <code>p(n,x)</code> defined at Comments.
 * @author Sean A. Irvine
 */
public class A192953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192953() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 2, 6});
  }
}
