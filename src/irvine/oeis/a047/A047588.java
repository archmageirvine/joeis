package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047588.
 * @author Sean A. Irvine
 */
public class A047588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047588() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 5, 6, 7, 8});
  }
}
