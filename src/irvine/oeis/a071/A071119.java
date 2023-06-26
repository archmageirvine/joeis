package irvine.oeis.a071;

import irvine.oeis.FiniteSequence;

/**
 * A071119 Palindromic primes in which deleting the outside pair of digits yields a prime at every stage until finally a single-digit prime is obtained.
 * @author Georg Fischer
 */
public class A071119 extends FiniteSequence {

  /** Construct the sequence. */
  public A071119() {
    super(1, FINITE, 2, 3, 5, 7, 131, 151, 353, 373, 727, 757, 929, 11311, 31513, 33533, 37273, 37573, 39293, 71317, 93739, 97579, 1335331, 3315133, 3392933, 7392937, 9375739, 373929373L, 733929337L);
  }
}
