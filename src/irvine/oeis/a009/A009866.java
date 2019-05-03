package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009866 Coordination sequence <code>T1</code> for Zeolite Code AHT.
 * @author Sean A. Irvine
 */
public class A009866 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009866() {
    super(
      new long[] {1, 2, 4, 3, 5, 5, 5, 3, 4, 2, 1},
      new int[] {1, 1, 8});
  }
}

