package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215634.
 * @author Sean A. Irvine
 */
public class A215634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215634() {
    super(new long[] {-3, -9, -6}, new long[] {3, -6, 18});
  }
}
