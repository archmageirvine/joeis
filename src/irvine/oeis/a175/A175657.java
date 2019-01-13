package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175657.
 * @author Sean A. Irvine
 */
public class A175657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175657() {
    super(new long[] {-2, -1, 3}, new long[] {1, 4, 8});
  }
}
