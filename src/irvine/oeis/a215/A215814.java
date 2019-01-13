package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215814.
 * @author Sean A. Irvine
 */
public class A215814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215814() {
    super(new long[] {1, -3, 3}, new long[] {2481403, 2480911, 2601451});
  }
}
