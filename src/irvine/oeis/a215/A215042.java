package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215042.
 * @author Sean A. Irvine
 */
public class A215042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215042() {
    super(new long[] {-1, 21, -56, 21}, new long[] {0, 7, 141, 2576});
  }
}
