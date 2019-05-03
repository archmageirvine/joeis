package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301138 Coordination sequence <code>T2</code> for Zeolite Code NAB.
 * @author Sean A. Irvine
 */
public class A301138 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301138() {
    super(
      new long[] {1, 4, 8, 18, 31, 32, 35, 22, 4, 4, 1},
      new int[] {3, 3, 4});
  }
}

