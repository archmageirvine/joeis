package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251991 Numbers n such that the sum of the pentagonal numbers P(n) and P(n+1) is equal to the sum of the hexagonal numbers H(m) and H(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A251991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251991() {
    super(new long[] {1, -195, 195}, new long[] {60, 11704, 2270580});
  }
}
