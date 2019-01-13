package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215695.
 * @author Sean A. Irvine
 */
public class A215695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215695() {
    super(new long[] {1, -6, 5}, new long[] {1, 0, -2});
  }
}
