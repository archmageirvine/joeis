package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056046 Number of 3-antichain covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A056046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056046() {
    super(new long[] {-840, 2038, -1849, 820, -190, 22}, new long[] {0, 0, 0, 2, 56, 790});
  }
}
