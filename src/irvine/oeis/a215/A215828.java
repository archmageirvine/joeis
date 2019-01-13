package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215828.
 * @author Sean A. Irvine
 */
public class A215828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215828() {
    super(new long[] {1, 0, 0, 25, 0, 0, 31, 0, 0}, new long[] {3, 1, 3, 31, 53, 87, 1011, 1673, 2771});
  }
}
