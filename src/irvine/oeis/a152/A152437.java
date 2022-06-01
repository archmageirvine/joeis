package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152437 (17^n - 1)/(2^(5 - (n % 2))).
 * @author Sean A. Irvine
 */
public class A152437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152437() {
    super(new long[] {-289, 0, 290, 0}, new long[] {0, 1, 9, 307});
  }
}
