package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245783 Numbers n such that the hexagonal number H(n) is equal to the sum of the pentagonal numbers P(m) and P(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A245783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245783() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 2, 57, 166, 5561});
  }
}
