package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009945 Coordination sequence for NiAs(2), As position.
 * @author Sean A. Irvine
 */
public class A009945 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009945() {
    super(
      new long[] {1, 4, 7, 12, 7, 4, 1},
      new int[] {1, 1, 4});
  }
}
