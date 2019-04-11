package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236584 The number of tilings of <code>a 9</code> X <code>(2n) floor</code> with 2 X 3 hexominoes.
 * @author Sean A. Irvine
 */
public class A236584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236584() {
    super(new long[] {-2, 4, -1, 2}, new long[] {1, 1, 1, 5});
  }
}
