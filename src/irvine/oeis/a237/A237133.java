package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237133 Values of x in the solutions to <code>x^2 -</code> 3xy + y^2 <code>+ 19 = 0,</code> where <code>0 &lt; x &lt;</code> y.
 * @author Sean A. Irvine
 */
public class A237133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237133() {
    super(new long[] {-1, 0, 3, 0}, new long[] {4, 5, 7, 11});
  }
}
