package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215694.
 * @author Sean A. Irvine
 */
public class A215694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215694() {
    super(new long[] {1, -6, 5}, new long[] {1, 2, 7});
  }
}
