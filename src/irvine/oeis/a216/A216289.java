package irvine.oeis.a216;

import irvine.oeis.FiniteSequence;

/**
 * A216289 Smallest k in which there are exactly n primes between 10*k and 10*k+9.
 * @author Georg Fischer
 */
public class A216289 extends FiniteSequence {

  /** Construct the sequence. */
  public A216289() {
    super(20, 9, 2, 4, 0);
  }
}
