package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008257 Coordination sequence <code>T2</code> for Milarite.
 * @author Sean A. Irvine
 */
public class A008257 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008257() {
    super(
      new long[] {1, 4, 12, 22, 36, 58, 93, 132, 151, 168, 199, 236, 240, 224, 207, 184, 171, 136, 99, 66, 42, 22, 16, 4, -5, 0, 2},
      new int[] {6, 8, 10});
  }
}

