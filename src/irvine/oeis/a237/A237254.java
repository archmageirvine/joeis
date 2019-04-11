package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237254 Values of x in the solutions to <code>x^2 -</code> 5xy + y^2 <code>+ 5 = 0,</code> where <code>0 &lt; x &lt;</code> y.
 * @author Sean A. Irvine
 */
public class A237254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237254() {
    super(new long[] {-1, 0, 5, 0}, new long[] {1, 2, 3, 9});
  }
}
