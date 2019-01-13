package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266810.
 * @author Sean A. Irvine
 */
public class A266810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266810() {
    super(new long[] {32, -8, 0, -4, -31, 8, 0, 4}, new long[] {1, 7, 25, 111, 433, 1751, 7033, 28047});
  }
}
