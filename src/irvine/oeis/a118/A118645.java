package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118645 Number of binary strings of length n such that there exist three consecutive digits where at least two of them are 1's.
 * @author Sean A. Irvine
 */
public class A118645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118645() {
    super(new long[] {-2, 1, -2, 3}, new long[] {0, 0, 1, 4});
  }
}
