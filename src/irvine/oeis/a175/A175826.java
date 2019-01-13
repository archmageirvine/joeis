package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175826.
 * @author Sean A. Irvine
 */
public class A175826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175826() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {0, 1, 2, 4, 6, 10, 15});
  }
}
