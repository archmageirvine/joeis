package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008706 Coordination sequence for 3.3.3.4.4 planar net.
 * @author Sean A. Irvine
 */
public class A008706 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008706() {
    super(
      new long[] {1, 3, 1},
      new int[] {1, 1});
  }
}

