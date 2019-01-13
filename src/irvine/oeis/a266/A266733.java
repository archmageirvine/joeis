package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266733.
 * @author Sean A. Irvine
 */
public class A266733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266733() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 21, 168, 756, 2520, 6930, 16632, 36036});
  }
}
