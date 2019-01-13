package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215666.
 * @author Sean A. Irvine
 */
public class A215666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215666() {
    super(new long[] {-1, 3, 0}, new long[] {0, -3, 6});
  }
}
