package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179370 Positive integers of the form <code>(7*m^2+1)/11</code>.
 * @author Sean A. Irvine
 */
public class A179370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179370() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {16, 23, 163, 184, 464});
  }
}
