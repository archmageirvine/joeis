package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301118 Coordination sequence <code>T2</code> for Zeolite Code LIT.
 * @author Sean A. Irvine
 */
public class A301118 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301118() {
    super(
      new long[] {1, 4, 9, 18, 30, 40, 49, 57, 60, 58, 56, 58, 60, 57, 49, 40, 30, 18, 9, 4, 1},
      new int[] {3, 5, 12});
  }
}

