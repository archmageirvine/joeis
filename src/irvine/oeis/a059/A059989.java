package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059989 Numbers n such that 3*n+1 and 4*n+1 are both squares.
 * @author Sean A. Irvine
 */
public class A059989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059989() {
    super(1, new long[] {1, -195, 195}, new long[] {0, 56, 10920});
  }
}
