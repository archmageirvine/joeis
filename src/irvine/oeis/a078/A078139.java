package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078139 Primes which cannot be written as sum of squares&gt;1.
 * @author Georg Fischer
 */
public class A078139 extends FiniteSequence {

  /** Construct the sequence. */
  public A078139() {
    super(1, FINITE, 2, 3, 5, 7, 11, 19, 23);
  }
}
