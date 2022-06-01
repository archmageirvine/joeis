package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179370 Positive integers of the form (7*m^2+1)/11.
 * @author Sean A. Irvine
 */
public class A179370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179370() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {16, 23, 163, 184, 464});
  }
}
