package irvine.oeis.a009;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A009925 Coordination sequence for CaF2(2), F position.
 * @author Sean A. Irvine
 */
public class A009925 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009925() {
    super(
      new long[] {1, 4, 19, 12, 19, 4, 1},
      new int[] {2, 2, 2});
  }
}
