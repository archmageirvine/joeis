package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129288 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x + 41)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A129288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129288() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 36, 39, 123, 319, 336, 820});
  }
}
