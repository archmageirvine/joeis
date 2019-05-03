package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179337 Positive integers of the form <code>(6*m^2 + 1)/11</code>.
 * @author Sean A. Irvine
 */
public class A179337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179337() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {5, 35, 107, 197, 341});
  }
}
