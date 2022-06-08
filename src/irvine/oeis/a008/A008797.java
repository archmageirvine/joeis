package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008797 Molien series for group [2,4]+ = 224.
 * @author Sean A. Irvine
 */
public class A008797 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008797() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new int[] {2, 2, 4});
  }
}

