package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215580 Partial sums of A215602.
 * @author Sean A. Irvine
 */
public class A215580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215580() {
    super(new long[] {1, -3, 0, 3}, new long[] {2, 5, 17, 45});
  }
}
