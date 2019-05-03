package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236581 The number of tilings of a <code>7 X (4n)</code> floor with <code>1 X 4</code> tetrominoes.
 * @author Sean A. Irvine
 */
public class A236581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236581() {
    super(new long[] {-1, 4, -6, 8}, new long[] {1, 5, 37, 269});
  }
}
