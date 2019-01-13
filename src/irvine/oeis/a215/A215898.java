package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215898.
 * @author Sean A. Irvine
 */
public class A215898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215898() {
    super(new long[] {1, 1, 1, 1, -1, -1, -1}, new long[] {1, -2, 4, -3, 5, -8, 10});
  }
}
