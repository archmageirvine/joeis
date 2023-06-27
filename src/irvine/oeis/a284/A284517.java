package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284517 Periodic with period [1, 4, 3, 4, 1, 6] of length 6.
 * @author Sean A. Irvine
 */
public class A284517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284517() {
    super(1, new long[] {1, 1, 0, -1}, new long[] {1, 4, 3, 4});
  }
}
