package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215917.
 * @author Sean A. Irvine
 */
public class A215917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215917() {
    super(new long[] {1, 0, -3}, new long[] {0, 6, -15});
  }
}
