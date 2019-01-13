package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266609.
 * @author Sean A. Irvine
 */
public class A266609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266609() {
    super(new long[] {-10000, 0, 1, 0, 10000, 0}, new long[] {1, 0, 101, 1100100, 1, 11111111000L});
  }
}
