package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226096 Squares with doubled (4*n+2)^2.
 * @author Sean A. Irvine
 */
public class A226096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226096() {
    super(new long[] {1, -1, 0, 0, 0, -2, 2, 0, 0, 0, 1}, new long[] {1, 4, 4, 9, 16, 25, 36, 36, 49, 64, 81});
  }
}
