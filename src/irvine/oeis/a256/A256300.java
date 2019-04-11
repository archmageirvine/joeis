package irvine.oeis.a256;

import irvine.oeis.FiniteSequence;

/**
 * A256300 Least prime p such that p+6^k is prime for all <code>k=0,...,n</code>.
 * @author Georg Fischer
 */
public class A256300 extends FiniteSequence {

  /** Construct the sequence. */
  public A256300() {
    super(2, 5, 5, 7, 7, 131, 1087, 1087, 1087, 3599111);
  }
}
