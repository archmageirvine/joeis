package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009946 Coordination sequence for NiAs(2), Ni position.
 * @author Sean A. Irvine
 */
public class A009946 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009946() {
    super(
      new long[] {1, 4, 8, 4, 1},
      new int[] {1, 1, 2});
  }
}
