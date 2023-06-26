package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178784 Let d be the vector of divisors of 100 sorted from largest to smallest, i.e., [100,50,25,20,10,5,4,2,1]. Then a(n) = 100/d(n) - 1.
 * @author Georg Fischer
 */
public class A178784 extends FiniteSequence {

  /** Construct the sequence. */
  public A178784() {
    super(1, FINITE, 0, 1, 3, 4, 9, 19, 24, 49, 99);
  }
}
