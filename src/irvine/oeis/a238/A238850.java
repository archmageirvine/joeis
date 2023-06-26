package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238850 Right-truncatable reversible primes in base 10.
 * @author Georg Fischer
 */
public class A238850 extends FiniteSequence {

  /** Construct the sequence. */
  public A238850() {
    super(1, FINITE, 2, 3, 5, 7, 31, 37, 71, 73, 79, 311, 313, 373, 733, 739, 797, 3733);
  }
}
