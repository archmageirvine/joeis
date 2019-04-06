package irvine.oeis.a235;

import irvine.oeis.FiniteSequence;

/**
 * A235623 Numbers n for which in the prime power factorization of n!, the numbers of exponents 1 and &gt;1 are equal.
 * @author Georg Fischer
 */
public class A235623 extends FiniteSequence {

  /** Construct the sequence. */
  public A235623() {
    super(0, 1, 4, 7, 8, 9, 13, 19, 20, 21);
  }
}
