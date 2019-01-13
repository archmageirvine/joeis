package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215097.
 * @author Sean A. Irvine
 */
public class A215097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215097() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 1, 8, 26, 56, 99});
  }
}
