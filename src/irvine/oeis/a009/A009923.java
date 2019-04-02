package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009923 Coordination sequence for CaF2(1), Ca position.
 * @author Sean A. Irvine
 */
public class A009923 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009923() {
    super(
      new long[] {1, 8, 35, 68, 88, 82, 29, 8, -5, 6},
      new int[] {2, 3, 3});
  }
}
