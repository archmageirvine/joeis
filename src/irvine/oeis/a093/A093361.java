package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093361 Add/multiply sequence, see example.
 * @author Sean A. Irvine
 */
public class A093361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093361() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 7, 11, 27, 33, 69});
  }
}
