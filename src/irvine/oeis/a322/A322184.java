package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322184 List of primes that appear in the <code>3X3</code> matrices A, B, C which are the smallest solution to the matrix equation AB = C in square matrices composed of distinct primes.
 * @author Georg Fischer
 */
public class A322184 extends FiniteSequence {

  /** Construct the sequence. */
  public A322184() {
    super(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 1549, 1553, 1619, 1741, 1759, 2053, 2083, 2129, 2437);
  }
}
