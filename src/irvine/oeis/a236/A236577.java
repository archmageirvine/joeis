package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236577 The number of tilings of a <code>6 X n</code> floor with <code>1 X 3</code> trominoes.
 * @author Sean A. Irvine
 */
public class A236577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236577() {
    super(new long[] {-1, -1, 1, 5, 3, -1, -10, -5, -1, 7, 1, 1}, new long[] {1, 1, 1, 6, 13, 22, 64, 155, 321, 783, 1888, 4233});
  }
}
