package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141845.
 * @author Sean A. Irvine
 */
public class A141845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141845() {
    super(new long[] {5, -6, 1, 0, -5, 6}, new long[] {1, 7, 38, 194, 976, 4887});
  }
}
