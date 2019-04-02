package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236579 The number of tilings of a 5 X (4n) floor with 1 X 4 tetrominoes.
 * @author Sean A. Irvine
 */
public class A236579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236579() {
    super(new long[] {-1, 4, -6, 6}, new long[] {1, 3, 15, 75});
  }
}
