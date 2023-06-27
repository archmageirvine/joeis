package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261932 The first of two consecutive positive integers the sum of the squares of which is equal to the sum of the squares of ten consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261932() {
    super(1, new long[] {1, -1, 0, 0, -18, 18, 0, 0, 1}, new long[] {26, 48, 68, 126, 468, 866, 1226, 2268, 8406});
  }
}
