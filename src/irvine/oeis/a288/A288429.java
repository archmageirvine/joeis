package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288429.
 * @author Sean A. Irvine
 */
public class A288429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288429() {
    super(new long[] {-1, 1, -1, 2}, new long[] {2, 4, 5, 6});
  }
}
