package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266068.
 * @author Sean A. Irvine
 */
public class A266068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266068() {
    super(new long[] {100000, 0, -110010, 0, 10011, 0}, new long[] {1, 100, 10, 1111001, 100, 11111110011L});
  }
}
