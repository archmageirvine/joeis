package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236653 Positive integers n such that n^3 divided by the digital root of n is a cube.
 * @author Sean A. Irvine
 */
public class A236653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236653() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 8, 10, 19});
  }
}
