package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019449.
 * @author Sean A. Irvine
 */
public class A019449 extends CoordinationSequence {

  // Conjectural

  /** Construct the sequence. */
  public A019449() {
    super(
      new long[] {1, 0, 2, 1, 1, 2, 0, 1, -1},
      new int[] {1, 3, 4, 6});
  }
}
