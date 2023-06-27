package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236680 Dimension of the space of spinors in n-dimensional real space.
 * @author Sean A. Irvine
 */
public class A236680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236680() {
    super(1, new long[] {8, -8, 4, 0, -2, 2}, new long[] {1, 2, 4, 4, 4, 4});
  }
}
