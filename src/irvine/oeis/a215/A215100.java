package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215100.
 * @author Sean A. Irvine
 */
public class A215100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215100() {
    super(new long[] {1, 4, 3}, new long[] {2, 5, 22});
  }
}
