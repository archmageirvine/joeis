package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118332 Primes of the form n!! + (n+1)!!.
 * @author Georg Fischer
 */
public class A118332 extends FiniteSequence {

  /** Construct the sequence. */
  public A118332() {
    super(1, FINITE, 2, 3, 5, 11, 23);
  }
}
