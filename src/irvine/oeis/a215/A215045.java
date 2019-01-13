package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215045.
 * @author Sean A. Irvine
 */
public class A215045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215045() {
    super(new long[] {-1, 144, -2640, 6930, -2640, 144}, new long[] {1, 32, 3125, 371293, 45435424, 5584059449L});
  }
}
