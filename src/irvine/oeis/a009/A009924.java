package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009924 Coordination sequence for CaF2(1), F position.
 * @author Sean A. Irvine
 */
public class A009924 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009924() {
    super(
      new long[] {1, 9, 24, 46, 42, 28, 9, 1},
      new int[] {1, 3, 3});
  }
}
