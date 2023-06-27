package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124437 Experience Points thresholds for levels in the pen and paper role-playing game "Das Schwarze Auge" (DSA, a.k.a. "The Dark Eye").
 * @author Sean A. Irvine
 */
public class A124437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124437() {
    super(1, new long[] {1, -3, 3}, new long[] {0, 100, 300});
  }
}
