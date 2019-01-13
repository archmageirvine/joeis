package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266668.
 * @author Sean A. Irvine
 */
public class A266668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266668() {
    super(new long[] {-32, -16, 34, 17, -2}, new long[] {1, 5, 4, 119, 16});
  }
}
