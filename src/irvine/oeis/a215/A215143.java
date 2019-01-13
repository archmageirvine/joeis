package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215143.
 * @author Sean A. Irvine
 */
public class A215143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215143() {
    super(new long[] {7, -14, 7}, new long[] {1, 2, 7});
  }
}
