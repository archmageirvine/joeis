package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127978.
 * @author Sean A. Irvine
 */
public class A127978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127978() {
    super(new long[] {-4, -4, 3, 2}, new long[] {3, 5, 15, 31});
  }
}
