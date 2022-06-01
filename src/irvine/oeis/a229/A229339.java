package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229339 GCD of all sums of n consecutive Lucas numbers.
 * @author Sean A. Irvine
 */
public class A229339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229339() {
    super(new long[] {1, 0, 0, 0, -3, 0, -1, 0, 1, 0, 3, 0, 0, 0}, new long[] {1, 1, 2, 5, 1, 4, 1, 15, 2, 11, 1, 40, 1, 29});
  }
}
