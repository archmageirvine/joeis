package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179338 Positive integers of the form (10*m^2+1)/11.
 * @author Sean A. Irvine
 */
public class A179338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179338() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 91, 131, 401, 481});
  }
}
