package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301141 Coordination sequence <code>T2</code> for Zeolite Code NSI.
 * @author Sean A. Irvine
 */
public class A301141 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301141() {
    super(
      new long[] {1, 4, 12, 24, 32, 28, 12, -21, -57, -70, -57, -21, 12, 28, 32, 24, 12, 4, 1},
      new int[] {3, 3, 4, 4, 4});
  }
}

