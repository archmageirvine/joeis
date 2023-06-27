package irvine.oeis.a237;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A237255 Values of x in the solutions to x^2 - 5xy + y^2 + 17 = 0, where 0 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A237255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237255() {
    super(1, new long[] {-1, 0, 5, 0}, new long[] {2, 3, 7, 13});
  }
}
