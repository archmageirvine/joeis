package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218735 Values of x in the solutions to x^2 - 3xy + y^2 + 29 = 0, where 0 &lt; x &lt; y.
 * @author Sean A. Irvine
 */
public class A218735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218735() {
    super(new long[] {-1, 0, 3, 0}, new long[] {5, 6, 9, 13});
  }
}
