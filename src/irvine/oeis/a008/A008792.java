package irvine.oeis.a008;

import irvine.oeis.FiniteSequence;

/**
 * A008792 Amino acid numbers, based on the rules made to assign each amino acid a unique number smaller than 64.
 * @author Sean A. Irvine
 */
public class A008792 extends FiniteSequence {

  /** Construct the sequence. */
  public A008792() {
    super(1, FINITE, 1, 2, 3, 5, 7, 11, 13, 17, 19, 25, 29, 31, 37, 41, 43, 45, 47, 53, 59, 61);
  }
}
