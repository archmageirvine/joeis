package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254749 1-gonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A254749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254749() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {1, 2, 2, 0});
  }
}
