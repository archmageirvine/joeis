package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123282 X-values of solutions to the equation 3(X-Y)^4 - 4*X*Y = 0 with X &gt;= Y.
 * @author Sean A. Irvine
 */
public class A123282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123282() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 16, 2744, 527280});
  }
}
