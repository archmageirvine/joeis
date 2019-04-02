package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009943 Coordination sequence for NiAs(1), As position.
 * @author Sean A. Irvine
 */
public class A009943 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009943() {
    super(
      new long[] {1, 4, 12, 10, -5, 2},
      new int[] {1, 1, 2});
  }
}
