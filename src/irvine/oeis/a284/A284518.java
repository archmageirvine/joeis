package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284518 Periodic with period [1, 10, 9, 16, 1, 18, 1, 16, 9, 10, 1, 24] of length 12.
 * @author Sean A. Irvine
 */
public class A284518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284518() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, 10, 9, 16, 1, 18});
  }
}
