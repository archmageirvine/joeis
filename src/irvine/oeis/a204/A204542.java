package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204542 Numbers that are congruent to {1, 4, 11, 14} mod 15.
 * @author Sean A. Irvine
 */
public class A204542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204542() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 11, 14, 16});
  }
}
