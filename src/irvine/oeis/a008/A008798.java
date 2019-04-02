package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008798 Molien series for group [2,5]+ = 225.
 * @author Sean A. Irvine
 */
public class A008798 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008798() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 5});
  }
}

