package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151754 Number of n-digit numbers that are divisible by 5^n.
 * @author Sean A. Irvine
 */
public class A151754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151754() {
    super(new long[] {-2, 3, -3, 3}, new long[] {1, 3, 7, 14});
  }
}
