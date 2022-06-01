package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085502 Number of (unordered) ways of making change for n dollars using coins of denominations 1, 5, 10, 25, 50 and 100.
 * @author Sean A. Irvine
 */
public class A085502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085502() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 293, 2728, 12318, 38835, 98411});
  }
}
