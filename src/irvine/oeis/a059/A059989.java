package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059989 Numbers k such that 3*k+1 and 4*k+1 are both squares.
 * @author Sean A. Irvine
 */
public class A059989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059989() {
    super(1, new long[] {1, -195, 195}, new long[] {0, 56, 10920});
  }
}
