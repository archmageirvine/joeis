package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151980 Numbers n such that n^2 - n is divisible by 20.
 * @author Sean A. Irvine
 */
public class A151980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151980() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 5, 16, 20});
  }
}
