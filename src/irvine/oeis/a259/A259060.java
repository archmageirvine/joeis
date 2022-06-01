package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259060 Numbers that are representable in at least two ways as sums of four distinct nonvanishing cubes.
 * @author Sean A. Irvine
 */
public class A259060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259060() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6426, 7900, 9614, 11592});
  }
}
