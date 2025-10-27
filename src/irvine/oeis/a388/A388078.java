package irvine.oeis.a388;

import irvine.oeis.FiniteSequence;

/**
 * A388078 Smallest prime p such that p + 6^i is prime for all i = 1 to n and not for i = n + 1.
 * @author Sean A. Irvine
 */
public class A388078 extends FiniteSequence {

  /** Construct the sequence. */
  public A388078() {
    super(1, FINITE, 13, 5, 17, 7, 131, 1283, 12373, 1087, 3599111);
  }
}

