package irvine.oeis.a235;

import irvine.oeis.FiniteSequence;

/**
 * A235623 Numbers n for which in the prime power factorization of <code>n!,</code> the numbers of exponents 1 and <code>&gt;1</code> are equal.
 * @author Georg Fischer
 */
public class A235623 extends FiniteSequence {

  /** Construct the sequence. */
  public A235623() {
    super(0, 1, 4, 7, 8, 9, 13, 19, 20, 21);
  }
}
