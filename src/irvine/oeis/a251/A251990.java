package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251990 Numbers n such that the sum of the hexagonal numbers <code>H(n)</code> and <code>H(n+1)</code> is equal to the sum of the pentagonal numbers <code>P(m)</code> and <code>P(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A251990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251990() {
    super(new long[] {1, -195, 195}, new long[] {52, 10136, 1966380});
  }
}
