package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119749 Number of compositions of n into odd blocks with one element in each block distinguished.
 * @author Sean A. Irvine
 */
public class A119749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119749() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 1, 4, 7});
  }
}
