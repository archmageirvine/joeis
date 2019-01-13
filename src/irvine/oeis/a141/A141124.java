package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141124.
 * @author Sean A. Irvine
 */
public class A141124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141124() {
    super(new long[] {-1, 0, -2, 0}, new long[] {1, 5, -9, -9});
  }
}
