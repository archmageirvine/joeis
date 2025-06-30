package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;

/**
 * A074253 Numbers n such that the sum of squarefree numbers from the smallest prime factor of n to the largest prime factor of n is a square.
 * @author Sean A. Irvine
 */
public class A074253 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074253() {
    super(1, 1, new A074251(), SQUARE);
  }
}
