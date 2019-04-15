package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236576 The number of tilings of <code>a 5</code> X <code>(3n)</code> floor with 1 X 3 trominoes.
 * @author Sean A. Irvine
 */
public class A236576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236576() {
    super(new long[] {1, -3, 6}, new long[] {1, 4, 22});
  }
}
