package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127630.
 * @author Sean A. Irvine
 */
public class A127630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127630() {
    super(new long[] {-1, 0, -2, 0}, new long[] {1, 1, -3, -3});
  }
}
