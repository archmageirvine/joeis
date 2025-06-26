package irvine.oeis.a384;

import irvine.oeis.FiniteSequence;

/**
 * A384708 a(n) is the smallest integer k such that k is the sum of exactly n distinct permutations of k, all having the same number of digits as k.
 * @author Sean A. Irvine
 */
public class A384708 extends FiniteSequence {

  /** Construct the sequence. */
  public A384708() {
    super(1, FINITE, 1, 954, 4617, 5112, 8136, 67104, 76011, 90216, 910107);
  }
}
