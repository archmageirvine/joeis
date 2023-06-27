package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173961 Averages of two consecutive even cubes: (n^3+(n+2)^3)/2.
 * @author Sean A. Irvine
 */
public class A173961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173961() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {4, 36, 140, 364});
  }
}
