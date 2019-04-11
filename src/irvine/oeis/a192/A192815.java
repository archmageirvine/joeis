package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192815 Coefficient of x in the reduction of the polynomial <code>(2*x + 1)^n</code> by <code>x^3 -&gt; x^2 + x + 1</code>.
 * @author Sean A. Irvine
 */
public class A192815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192815() {
    super(new long[] {7, -3, 5}, new long[] {0, 2, 4});
  }
}
