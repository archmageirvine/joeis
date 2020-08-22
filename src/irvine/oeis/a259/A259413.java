package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259413 Triangular numbers (A000217) that are the sum of eleven consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A259413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259413() {
    super(new long[] {1, -1, 0, 0, -398, 398, 0, 0, 1}, new long[] {2145, 3916, 7381, 13530, 843051, 1547920, 2926990, 5374281, 335521560});
  }
}
