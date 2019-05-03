package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245783 Numbers n such that the hexagonal number <code>H(n)</code> is equal to the sum of the pentagonal numbers <code>P(m)</code> and <code>P(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A245783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245783() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 2, 57, 166, 5561});
  }
}
