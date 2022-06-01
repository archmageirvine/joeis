package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247375 Numbers m such that floor(m/2) is a square.
 * @author Sean A. Irvine
 */
public class A247375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247375() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 2, 3, 8});
  }
}
