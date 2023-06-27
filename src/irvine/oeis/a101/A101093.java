package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101093 Second partial sums of sixth powers (A001014).
 * @author Sean A. Irvine
 */
public class A101093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101093() {
    super(1, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 66, 860, 5750, 26265, 93436, 278256, 725220, 1703625});
  }
}
