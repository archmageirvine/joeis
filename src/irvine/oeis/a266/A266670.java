package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266670.
 * @author Sean A. Irvine
 */
public class A266670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266670() {
    super(new long[] {10000000, 0, -10011000, 0, 11001, 0}, new long[] {1, 11, 1000, 1011111, 1000000, 11011111111L});
  }
}
