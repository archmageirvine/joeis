package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009941 Coordination sequence for Ni2In, Position Ni1 and In.
 * @author Sean A. Irvine
 */
public class A009941 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009941() {
    super(
      new long[] {1, 10, 35, 40, 35, 10, 1},
      new int[] {1, 2, 3});
  }
}
