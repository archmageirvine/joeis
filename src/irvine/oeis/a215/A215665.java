package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215665.
 * @author Sean A. Irvine
 */
public class A215665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215665() {
    super(new long[] {-1, 3, 0}, new long[] {0, -3, -3});
  }
}
