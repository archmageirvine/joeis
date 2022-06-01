package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236584 The number of tilings of a 9 X (2n) floor with 2 X 3 hexominoes.
 * @author Sean A. Irvine
 */
public class A236584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236584() {
    super(new long[] {-2, 4, -1, 2}, new long[] {1, 1, 1, 5});
  }
}
