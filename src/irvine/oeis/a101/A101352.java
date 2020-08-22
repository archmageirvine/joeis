package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101352 Partial sums of A101351.
 * @author Sean A. Irvine
 */
public class A101352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101352() {
    super(new long[] {-2, 3, 3, -8, 5}, new long[] {0, 2, 6, 15, 33});
  }
}
