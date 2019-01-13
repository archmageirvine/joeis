package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047332.
 * @author Sean A. Irvine
 */
public class A047332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047332() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 6, 7});
  }
}
