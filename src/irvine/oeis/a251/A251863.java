package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251863 Numbers n such that the sum of the octagonal numbers N(n), N(n+1) and N(n+2) is equal to the sum of the pentagonal numbers P(m), P(m+1), P(m+2) for some m.
 * @author Sean A. Irvine
 */
public class A251863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251863() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {2, 147, 3102, 170407, 3580474});
  }
}
