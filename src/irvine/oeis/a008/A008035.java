package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008035 Coordination sequence <code>T2</code> for Zeolite Code APD.
 * @author Sean A. Irvine
 */
public class A008035 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008035() {
    super(
      new long[] {1, 4, 11, 21, 34, 48, 61, 74, 84, 92, 96, 96, 92, 84, 74, 61, 48, 34, 21, 11, 4, 1},
      new int[] {3, 7, 11});
  }
}

