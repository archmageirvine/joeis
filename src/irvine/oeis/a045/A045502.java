package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045502 Numbers k such that 2*k+1 and 3*k+1 are squares.
 * @author Sean A. Irvine
 */
public class A045502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045502() {
    super(new long[] {1, -99, 99}, new long[] {0, 40, 3960});
  }
}
