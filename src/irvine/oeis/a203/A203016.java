package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203016 Numbers congruent to {1, 2, 3, 4} mod 6, multiplied by 3.
 * @author Sean A. Irvine
 */
public class A203016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203016() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 6, 9, 12, 21});
  }
}
