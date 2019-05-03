package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236579 The number of tilings of a <code>5 X (4n)</code> floor with <code>1 X 4</code> tetrominoes.
 * @author Sean A. Irvine
 */
public class A236579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236579() {
    super(new long[] {-1, 4, -6, 6}, new long[] {1, 3, 15, 75});
  }
}
