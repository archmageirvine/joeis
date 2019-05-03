package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179088 Positive integers of the form <code>(2*m^2+1)/11</code>.
 * @author Sean A. Irvine
 */
public class A179088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179088() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 9, 41, 59, 123});
  }
}
