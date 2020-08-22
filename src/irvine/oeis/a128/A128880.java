package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128880 Triangular numbers congruent to 1 or 5 mod 6.
 * @author Sean A. Irvine
 */
public class A128880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128880() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 55, 91, 253, 325});
  }
}
