package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199336 x-values in the solution to 15*x^2 - 14 = y^2.
 * @author Sean A. Irvine
 */
public class A199336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199336() {
    super(1, new long[] {-1, 0, 8, 0}, new long[] {1, 3, 5, 23});
  }
}
