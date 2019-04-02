package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168465 Numbers that are congruent to 2 or 7 mod 11.
 * @author Sean A. Irvine
 */
public class A168465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168465() {
    super(new long[] {-1, 1, 1}, new long[] {2, 7, 13});
  }
}
