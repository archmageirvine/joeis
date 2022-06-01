package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269448 The first of 26 consecutive positive integers the sum of the squares of which is a square.
 * @author Sean A. Irvine
 */
public class A269448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269448() {
    super(new long[] {1, -1, 0, -102, 102, 0, 1}, new long[] {25, 301, 454, 3850, 31966, 47569, 393925});
  }
}
