package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215512.
 * @author Sean A. Irvine
 */
public class A215512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215512() {
    super(new long[] {1, -6, 5}, new long[] {1, 3, 8});
  }
}
