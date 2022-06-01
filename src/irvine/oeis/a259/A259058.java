package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259058 Numbers that are representable in at least two ways as sums of four distinct nonvanishing squares.
 * @author Sean A. Irvine
 */
public class A259058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259058() {
    super(new long[] {1, -3, 3}, new long[] {454, 530, 614});
  }
}
