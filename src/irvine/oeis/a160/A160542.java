package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160542 Not divisible by 11.
 * @author Sean A. Irvine
 */
public class A160542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160542() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12});
  }
}
