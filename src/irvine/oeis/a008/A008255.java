package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008255 Coordination sequence T2 for feldspar.
 * @author Sean A. Irvine
 */
public class A008255 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008255() {
    super(
      new long[] {1, 3, 6, 10, 10, 6, 3, 1},
      new int[] {1, 3, 3});
  }
}

