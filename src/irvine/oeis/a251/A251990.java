package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251990 Numbers n such that the sum of the hexagonal numbers H(n) and H(n+1) is equal to the sum of the pentagonal numbers P(m) and P(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A251990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251990() {
    super(new long[] {1, -195, 195}, new long[] {52, 10136, 1966380});
  }
}
