package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140201 Partial sums of A140081.
 * @author Sean A. Irvine
 */
public class A140201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140201() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 4, 4});
  }
}
