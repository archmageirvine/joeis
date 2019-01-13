package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215492.
 * @author Sean A. Irvine
 */
public class A215492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215492() {
    super(new long[] {7, 21, 0}, new long[] {0, 3, 6});
  }
}
