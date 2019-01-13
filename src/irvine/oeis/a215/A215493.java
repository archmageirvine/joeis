package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215493.
 * @author Sean A. Irvine
 */
public class A215493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215493() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 4});
  }
}
