package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175884.
 * @author Sean A. Irvine
 */
public class A175884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175884() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 4, 7, 9, 12});
  }
}
