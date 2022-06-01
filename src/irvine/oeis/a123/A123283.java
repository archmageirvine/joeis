package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123283 X-values of solutions to the equation 3(X-Y)^4 - 8*X*Y = 0 with X &gt;= Y.
 * @author Sean A. Irvine
 */
public class A123283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123283() {
    super(new long[] {-1, 108, -982, 108}, new long[] {0, 12, 1000, 96228});
  }
}
