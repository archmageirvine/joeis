package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215829.
 * @author Sean A. Irvine
 */
public class A215829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215829() {
    super(new long[] {3, 9, -3}, new long[] {3, -3, 27});
  }
}
