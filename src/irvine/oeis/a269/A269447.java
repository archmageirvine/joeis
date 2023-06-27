package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269447 The first of 23 consecutive positive integers the sum of the squares of which is a square.
 * @author Sean A. Irvine
 */
public class A269447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269447() {
    super(1, new long[] {1, -1, -48, 48, 1}, new long[] {7, 17, 881, 1351, 42787});
  }
}
