package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215147.
 * @author Sean A. Irvine
 */
public class A215147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215147() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 5, 6, 14, 15, 30});
  }
}
