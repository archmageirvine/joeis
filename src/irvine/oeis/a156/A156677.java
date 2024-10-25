package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156677 a(n) = 81*n^2 - 118*n + 43.
 * @author Sean A. Irvine
 */
public class A156677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156677() {
    super(new long[] {1, -3, 3}, new long[] {43, 6, 131});
  }
}
