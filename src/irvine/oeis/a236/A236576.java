package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236576 The number of tilings of a 5 X (3n) floor with 1 X 3 trominoes.
 * @author Sean A. Irvine
 */
public class A236576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236576() {
    super(new long[] {1, -3, 6}, new long[] {1, 4, 22});
  }
}
