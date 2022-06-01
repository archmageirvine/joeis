package irvine.oeis.a237;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A237254 Values of x in the solutions to x^2 - 5xy + y^2 + 5 = 0, where 0 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A237254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237254() {
    super(new long[] {-1, 0, 5, 0}, new long[] {1, 2, 3, 9});
  }
}
