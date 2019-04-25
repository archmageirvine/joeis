package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237255 Values of x in the solutions to <code>x^2 - 5xy + y^2 + 17 = 0,</code> where <code>0 &lt; x &lt; y</code>.
 * @author Sean A. Irvine
 */
public class A237255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237255() {
    super(new long[] {-1, 0, 5, 0}, new long[] {2, 3, 7, 13});
  }
}
